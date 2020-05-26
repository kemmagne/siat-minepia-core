package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.FlowGuceSiat;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.utils.ebms.UtilitiesException;
import org.guce.siat.common.utils.exception.ValidationException;

/**
 *
 * @author ht
 */
public interface XmlConverter {

    File convertDocumentToFile(final Serializable document) throws ParseException, ValidationException;

    Serializable convertFileToDocument(final File file, List<FileItem> fileItemList, final List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException;

    void update(File file, Serializable document);
}
