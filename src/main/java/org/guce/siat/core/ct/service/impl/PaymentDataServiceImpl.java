/*
 *
 */
package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.core.ct.dao.PaymentDataDao;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PaymentItemFlow;
import org.guce.siat.core.ct.service.PaymentDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class PaymentDataServiceImpl.
 */
@Service("paymentDataService")
@Transactional(readOnly = true)
public class PaymentDataServiceImpl extends AbstractServiceImpl<PaymentData> implements PaymentDataService {

    /**
     * The payment data dao.
     */
    @Autowired
    private PaymentDataDao paymentDataDao;

    /**
     * The item flow dao.
     */
    @Autowired
    private ItemFlowDao itemFlowDao;

    /**
     * The file item dao.
     */
    @Autowired
    private FileItemDao fileItemDao;

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<PaymentData> getJpaDao() {
        return paymentDataDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<PaymentData> jpaDao) {
        this.paymentDataDao = (PaymentDataDao) jpaDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.co.service.PaymentDataService#findPaymentDataByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public PaymentData findPaymentDataByItemFlow(final ItemFlow itemFlow) {

        return paymentDataDao.findPaymentDataByItemFlow(itemFlow);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.service.PaymentDataService#takeDecisionForPayment(org.guce.siat.common.model.File,
	 * org.guce.siat.common.model.User, org.guce.siat.common.model.Flow, org.guce.siat.core.co.model.PaymentData)
     */
    @Override
    @Transactional(readOnly = false)
    public PaymentData takeDecisionForPayment(final File currentFile, final User loggedUser, final Flow flowToExecute, final PaymentData paymentData) {

        final List<PaymentItemFlow> paymentItemFlowList = new ArrayList<>();

        final PaymentData paymentDataNew = new PaymentData();
        BeanUtils.copyProperties(paymentData, paymentDataNew, "id", "paymentItemFlowList", "invoiceLines");
        final Flow paymentFlow = itemFlowDao.findLastSentItemFlowByFileItem(currentFile.getFileItemsList().get(0)).getFlow();
        for (final FileItem fileItem : currentFile.getFileItemsList()) {
            //			Add new itemFlow
            final ItemFlow itemFlow = new ItemFlow();

            itemFlow.setCreated(java.util.Calendar.getInstance().getTime());
            itemFlow.setFileItem(fileItem);
            itemFlow.setFlow(flowToExecute);
            itemFlow.setSender(loggedUser);
            itemFlow.setSent(Boolean.TRUE);
            itemFlow.setUnread(Boolean.TRUE);
            final ItemFlow savedItemFlow = itemFlowDao.save(itemFlow);

            // Add Payment_ItemFlow
            final PaymentItemFlow paymentItemFlow = new PaymentItemFlow();

            paymentItemFlow.setPaymentData(paymentDataNew);
            paymentItemFlow.setItemFlow(savedItemFlow);
            paymentItemFlow.setDeleted(Boolean.FALSE);
            paymentItemFlowList.add(paymentItemFlow);

            // Update File item and execute flow
            fileItem.setDraft(Boolean.FALSE);

            //le STEP dépond du nombre des cotation
            if (Arrays.asList(FileTypeCode.CCS_MINSANTE).contains(currentFile.getFileType().getCode())){
                fileItem.setStep(flowToExecute.getToStep());
            }else{
                fileItem.setStep(paymentFlow.getFromStep());
            }
            fileItemDao.update(fileItem);
        }

        paymentDataNew.setPaymentItemFlowList(paymentItemFlowList);
        paymentDataDao.save(paymentDataNew);

        return paymentDataNew;
    }

    @Override
    public PaymentData findPaymentDataByFileItem(FileItem fileItem) {
        return paymentDataDao.findPaymentDataByFileItem(fileItem);
    }

}
