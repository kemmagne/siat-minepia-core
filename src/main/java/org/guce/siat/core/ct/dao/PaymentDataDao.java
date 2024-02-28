package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PaymentItemFlow;

/**
 * The Interface PaymentDataDao.
 */
public interface PaymentDataDao extends AbstractJpaDao<PaymentData> {

    /**
     * Find payment data by item flow.
     *
     * @param itemFlow the item flow
     * @return the payment data
     */
    PaymentData findPaymentDataByItemFlow(ItemFlow itemFlow);
    
    /**
     * Find payment data by item flow list.
     *
     * @param itemFlowList the item flow list
     * @return the payment data
     */
    PaymentData findPaymentDataByItemFlowList(List<ItemFlow> itemFlowList);
    
    /**
     * Find payment data by file item.
     *
     * @param fileItem the file item
     * @return the payment data
     */
    PaymentData findPaymentDataByFileItem(FileItem fileItem);
    
     /**
     * Find payment data by file.
     *
     * @param file the file
     * @return the payment data
     */
    PaymentData findPaymentDataByFile(File file);

    /**
     * Find payment item flow by item flow.
     *
     * @param itemFlow the item flow
     * @return the payment item flow
     */
    PaymentItemFlow findPaymentItemFlowByItemFlow(ItemFlow itemFlow);

    /**
     * Delete.
     *
     * @param paymentItemFlow the payment item flow
     */
    void delete(PaymentItemFlow paymentItemFlow);

}
