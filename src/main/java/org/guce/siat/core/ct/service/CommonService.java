package org.guce.siat.core.ct.service;

import java.io.File;
import java.util.List;

import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.DataType;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.filter.CteFilter;
import org.guce.siat.core.ct.filter.Filter;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.AnalysePart;
import org.guce.siat.core.ct.model.AnalyseResult;
import org.guce.siat.core.ct.model.ApprovedDecision;
import org.guce.siat.core.ct.model.CCTCPParamValue;
import org.guce.siat.core.ct.model.InspectionReport;
import org.guce.siat.core.ct.model.InterceptionNotification;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.Sample;
import org.guce.siat.core.ct.model.TreatmentInfos;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.guce.siat.core.ct.model.TreatmentPart;
import org.guce.siat.core.ct.model.TreatmentResult;
import org.guce.siat.core.ct.util.quota.QuotaDto;

/**
 * The Interface CommonService.
 */
public interface CommonService extends AbstractService<ItemFlow> {

	/**
	 * Send attached reports.
	 *
	 * @param attachments the attachments
	 */
	void sendAttachedReports(List<File> attachments);

	/**
	 * Delete attached reports.
	 *
	 * @param attachments the attachments
	 */
	void deleteAttachedReports(List<String> attachments);

	/**
	 * Take decision and save inspection reports.
	 *
	 * @param reports the reports
	 * @param itemFlowsToAdd the item flows to add
	 */
	void takeDecisionAndSaveInspectionReports(List<InspectionReport> reports, List<ItemFlow> itemFlowsToAdd);

	void takeDecisionAndSaveInspectionReport(final InspectionReport report, final List<ItemFlow> itemFlowsToAdd) throws Exception;

	/**
	 * Take decision and save analyse request.
	 *
	 * @param analysePartsList the analyse parts list
	 * @param analyseOrder the analyse order
	 * @param itemFlowsToAdd the item flows to add
	 */
	void takeDecisionAndSaveAnalyseRequest(List<AnalysePart> analysePartsList, AnalyseOrder analyseOrder,
			List<ItemFlow> itemFlowsToAdd);

	/**
	 * Take decision and save treatment request.
	 *
	 * @param treatmentPartsList the treatment parts list
	 * @param treatmentOrder the treatment order
	 * @param itemFlowsToAdd the item flows to add
	 */
	void takeDecisionAndSaveTreatmentRequest(List<TreatmentPart> treatmentPartsList, TreatmentOrder treatmentOrder,
			List<ItemFlow> itemFlowsToAdd);

	/**
	 * Take decision and save analyze result.
	 *
	 * @param analyseResult the analyse result
	 * @param itemFlows the item flows
	 */
	void takeDecisionAndSaveAnalyzeResult(AnalyseResult analyseResult, List<ItemFlow> itemFlows);

	/**
	 * Take decision and save treatment result.
	 *
	 * @param treatmentResult the treatment result
	 * @param itemFlows the item flows
	 */
	void takeDecisionAndSaveTreatmentResult(TreatmentResult treatmentResult, List<ItemFlow> itemFlows);

	/**
	 *
	 * @param treatmentResult
	 * @param itemFlowsToAdd
	 * @throws Exception
	 */
	void takeDecisionAndSaveTreatmentResult2(final TreatmentResult treatmentResult, final List<ItemFlow> itemFlowsToAdd) throws Exception;

	void takeDecisionAndSaveInterceptionNotification(InterceptionNotification interceptionNotif, List<ItemFlow> itemFlows);

	void takeDecisionAndSaveTreatmentInfos(TreatmentInfos treatmentInfos, List<ItemFlow> itemFlows) throws Exception;

	void takeDecisionAndSaveApprovedDecision(ApprovedDecision approvedDecision, List<ItemFlow> itemFlows) throws Exception;

	void takeDecisionAndSaveCCTCPParamValue(CCTCPParamValue cCTCPParamValue, List<ItemFlow> itemFlows) throws Exception;

	void takeDecisionAndSaveCCTCPParamValueAndDataType(CCTCPParamValue cCTCPParamValue, List<ItemFlowData> flowDatas, List<ItemFlow> itemFlows) throws Exception;

	/**
	 * Take decision and appointment.
	 *
	 * @param itemFlowsToAdd the item flows to add
	 * @param appointment the appointment
	 */
	void takeDecisionAndAppointment(List<ItemFlow> itemFlowsToAdd, Appointment appointment);

	/**
	 * Rollback eh minader decision.
	 *
	 * @param fileItems the file items
	 */
	void rollbackDecision(List<Long> fileItems);

	/**
	 * Find sample by file item.
	 *
	 * @param fileItem the file item
	 * @return the sample
	 */
	Sample findSampleByFileItem(FileItem fileItem);

	/**
	 * Find by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param administration the administration
	 * @return the list
	 */
	List<FileItem> findByFilter(final Filter filter, User loggedUser, final Administration administration);

	/**
	 * Find statistic by filter.
	 *
	 * @param filter the filter
	 * @return the list
	 */
	List<AnalyseOrder> findStatisticByFilter(Filter filter);

	/**
	 * File item by desicion by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param flowList the flow list
	 * @param restrectionFlowCode the restrection flow code
	 * @param administration the administration
	 * @return the list
	 */
	List<FileItem> fileItemByDesicionByFilter(final Filter filter, final User loggedUser, List<String> flowList,
			List<String> restrectionFlowCode, final Administration administration);

	/**
	 * File item by company and decicion by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param administration the administration
	 * @return the list
	 */
	List<FileItem> fileItemByCompanyAndDecicionByFilter(Filter filter, final User loggedUser, final Administration administration);

	/**
	 * File item by company and product by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param administration the administration
	 * @return the list
	 */
	List<FileItem> fileItemByCompanyAndProductByFilter(Filter filter, final User loggedUser, final Administration administration);

	/**
	 * File item by inspection destrib by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param administration the administration
	 * @return the list
	 */
	List<FileItem> fileItemByInspectionDestribByFilter(Filter filter, User loggedUser, final Administration administration);

	/**
	 * Service item products quantities by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param currentAdministration the current administration
	 * @return the list
	 */
	List<Object[]> serviceItemProductsQuantitiesByFilter(Filter filter, User loggedUser, Administration currentAdministration);

	List<Object[]> getActivitiesReport(CteFilter filter, User loggedUser);

	List<Object[]> getGlobalDelayListing(CteFilter filter, User loggedUser);

	List<Object[]> getDelayListingStakeholder(CteFilter filter, User loggedUser);

	List<Object[]> getExportNshDestination(CteFilter filter, User loggedUser);

	List<Object[]> getExportNshDestinationSender(CteFilter filter, User loggedUser);

	/**
	 * Service item products quantities by drd by filter.
	 *
	 * @param filter the filter
	 * @param flowCodeList the flow code list
	 * @param loggedUser the logged user
	 * @param currentAdministration the current administration
	 * @return the list
	 */
	List<Object[]> serviceItemProductsQuantitiesByDrdByFilter(Filter filter, List<String> flowCodeList, User loggedUser,
			Administration currentAdministration);

	/**
	 * Find quots.
	 *
	 * @param searchFilter the search filter
	 * @return the list
	 */
	List<QuotaDto> findQuotsByCreteria(QuotaDto searchFilter);

	/**
	 * File item by statistic business by filter.
	 *
	 * @param filter the filter
	 * @param loggedUser the logged user
	 * @param administration the administration
	 * @return the list
	 */
	List<FileItem> fileItemByStatisticBusinessByFilter(Filter filter, User loggedUser, Administration administration);

	/**
	 * Find pinding file item.
	 *
	 * @param filter the filter
	 * @param user the user
	 * @param fileTypeCodes the file type codes
	 * @return the list
	 */
	List<FileItem> findPindingFileItem(Filter filter, User user);

	/**
	 * Take dacision and save payment.
	 *
	 * @param itemFlows the item flows
	 * @param paymentData the flow datas
	 */
	void takeDacisionAndSavePayment(final List<ItemFlow> itemFlows, PaymentData paymentData);

	/**
	 * Show enabled file item.
	 *
	 * @param item the item
	 * @param itemFlow the item flow
	 * @param user the user
	 * @return true, if successful if the step is analysis , treatment or
	 * inspection, laboratory agent, treatment company or controller concerned
	 * can treat the file
	 */
	boolean showEnabledFileItem(final FileItem item, final ItemFlow itemFlow, User user);

	void saveTreatmentOrder(TreatmentOrder treatmentOrder, ItemFlow itemFlow);

	void saveTreatmentInfos(TreatmentInfos treatmentInfos, ItemFlow itemFlow);

	void saveApprovedDecision(ApprovedDecision approvedDecision, ItemFlow itemFlow);

	void saveCCTCPParamValue(CCTCPParamValue cCTCPParamValue, ItemFlow itemFlow);
}
