package org.guce.siat.core.ct.service;

import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.PaymentData;

/**
 * The Interface PaymentDataService.
 */
public interface PaymentDataService extends AbstractService<PaymentData> {

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
     * Take decision for payment.
     *
     * @param currentFile the current file
     * @param loggedUser the logged user
     * @param flowToExecute the flow to execute
     * @param paymentData the payment data
     * @return 
     */
    PaymentData takeDecisionForPayment(File currentFile, User loggedUser, Flow flowToExecute, final PaymentData paymentData);

    /**
     * Find payment data by file item.
     *
     * @param fileItem the file item
     * @return the payment data
     */
    PaymentData findPaymentDataByFileItem(FileItem fileItem);

}
