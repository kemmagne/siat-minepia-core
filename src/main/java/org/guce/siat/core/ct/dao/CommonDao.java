package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.core.ct.filter.CteFilter;
import org.guce.siat.core.ct.filter.Filter;
import org.guce.siat.core.ct.filter.ImCargFilter;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.PottingPresent;
import org.guce.siat.core.ct.model.Sample;
import org.guce.siat.core.ct.model.UserCctExportProductType;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.guce.siat.core.ct.util.quota.QuotaDto;

/**
 * The Interface CommonDao.
 */
public interface CommonDao extends AbstractJpaDao<ItemFlow> {

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
     * @param administration the administration
     * @param fileTypeCodes the file type codes
     * @return the list
     */
    List<FileItem> findByFilter(Filter filter, Administration administration, List<FileTypeCode> fileTypeCodes);

    List<FileItem> findByFilter(final Filter filter, final List<Administration> administrations, final List<FileTypeCode> fileTypeCodes);
    List<File> findFileByFilter(final Filter filter, final List<Administration> administrations, final List<Long> fileTypeIdList);

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
     * @param fileTypeCodes the file type codes
     * @param flowCodeList the flow code list
     * @param restrectionFlowCode the restrection flow code
     * @param administration the administration
     * @return the list
     */
    List<FileItem> fileItemByDesicionByFilter(Filter filter, List<FileTypeCode> fileTypeCodes, final List<String> flowCodeList, List<String> restrectionFlowCode, Administration administration);

    /**
     * File item by company and decicion by filter.
     *
     * @param filter the filter
     * @param fileTypeCodes the file type codes
     * @param administration the administration
     * @return the list
     */
    List<FileItem> fileItemByCompanyAndDecicionByFilter(Filter filter, List<FileTypeCode> fileTypeCodes, Administration administration);

    /**
     * File item by company and product by filter.
     *
     * @param filter the filter
     * @param fileTypeCodes the file type codes
     * @param administration the administration
     * @return the list
     */
    List<FileItem> fileItemByCompanyAndProductByFilter(Filter filter, List<FileTypeCode> fileTypeCodes, Administration administration);

    /**
     * File item by inspection destrib by filter.
     *
     * @param filter the filter
     * @param fileTypeCodes the file type codes
     * @param administration the administration
     * @return the list
     */
    List<FileItem> fileItemByInspectionDestribByFilter(Filter filter, List<FileTypeCode> fileTypeCodes, Administration administration);

    /**
     * Service item products quantities by filter.
     *
     * @param filter the filter
     * @param fileTypeIdList the file type id list
     * @param administration the administration
     * @return the list
     */
    List<Object[]> serviceItemProductsQuantitiesByFilter(Filter filter, List<Long> fileTypeIdList, Administration administration);

    /**
     * Service item products quantities by drd by filter.
     *
     * @param filter the filter
     * @param flowIdList the flow id list
     * @param fileTypeIdList the file type id list
     * @param administration the administration
     * @return the list
     */
    List<Object[]> serviceItemProductsQuantitiesByDrdByFilter(Filter filter, final List<Long> flowIdList, final List<Long> fileTypeIdList, Administration administration);

    /**
     * Find quots by creteria.
     *
     * @param searchFilter the search filter
     * @return the list
     */
    List<QuotaDto> findQuotsByCreteria(QuotaDto searchFilter);

    /**
     * Gets the imported exported quatity by file item.
     *
     * @param quotaList the quota list
     * @return the imported exported quatity by file item
     */
    List<QuotaDto> getImportedExportedQuatityByQuotaList(List<QuotaDto> quotaList);

    /**
     * Gets the validity date by quota list.
     *
     * @param quotaList the quota list
     * @param searchFilter the search filter
     * @return the validity date by quota list
     */
    List<QuotaDto> getGrantedQuantityByQuotaList(final List<QuotaDto> quotaList, final QuotaDto searchFilter);

    /**
     * File item by statistic business by filter.
     *
     * @param filter the filter
     * @param administration the administration
     * @param fileTypeCodes the file type codes
     * @return the list
     */
    List<FileItem> fileItemByStatisticBusinessByFilter(Filter filter, Administration administration, List<FileTypeCode> fileTypeCodes);

    /**
     * Find pinding file item.
     *
     * @param filter the filter
     * @param user the user
     * @return the list
     */
    List<FileItem> findPindingFileItem(Filter filter, User user);

    List<Object[]> getExportNshDestination(CteFilter filter, List<Long> fileTypeIdList);

    List<Object[]> getExportNshDestinationSender(CteFilter filter, List<Long> fileTypeIdList);

    List<Object[]> getActivitiesReport(CteFilter filter, List<Long> fileTypeIdList);

    List<Object[]> getGlobalDelayListing(CteFilter filter, List<Long> fileTypeIdList);

    List<Object[]> getGlobalQuantityListing(CteFilter filter, List<Long> fileTypeIdList);

    List<Object[]> getGlobalQuantityDetailListing(CteFilter filter, List<Long> fileTypeIdList);

    List<Object[]> getDelayListingStakeholder(CteFilter filter, List<Long> fileTypeIdList);

    void save(List<UserCctExportProductType> userProductTypes);

    void remove(List<UserCctExportProductType> userProductTypes);

    UserCctExportProductType findByUserAndProductType(User user, CctExportProductType productType);

    List<CctExportProductType> findProductTypesByUser(User user);

    List<UserCctExportProductType> findUsersAndProductTypes();

    PottingPresent savePottingPresent(PottingPresent pottingPresent);

    void updatePottingPresent(PottingPresent pottingPresent);

    List<PottingPresent> findPottingPresentsByFile(File file);

    List<File> findImCargFiles(org.guce.siat.core.ct.filter.ImCargFilter filter);

    List<Object[]> findImCargStatisticsByProduct(ImCargFilter filter);

    List<Object[]> findImCargStatisticsByImporter(ImCargFilter filter);

    List<Object[]> findImCargStatisticsByCountry(ImCargFilter filter);

}
