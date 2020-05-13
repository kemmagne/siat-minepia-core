package org.guce.siat.core.ct.util.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tadzotsa
 */
public enum CctExportProductType {

    CF("CAFE"),
    CC("CACAO"),
    COTON("COTON"),
    BT("BOIS TRANSFORMES"),
    GR("GRUMES"),
    OA("OBJETS D'ART"),
    PS("PRODUITS SPECIAUX"),
    AUTRES("AUTRES");

    private final String label;

    private CctExportProductType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static Map<String, String> getProductTypesMap() {

        Map<String, String> map = new HashMap<>();

        CctExportProductType[] all = CctExportProductType.values();
        for (CctExportProductType pt : all) {
            map.put(pt.name(), pt.label);
        }

        return map;
    }

    public static List<CctExportProductType> getProductTypes() {
        return Arrays.asList(CctExportProductType.values());
    }

    public static String getFileFieldCode() {
        return "TYPE_PRODUIT_CODE";
    }

    public static boolean isCC(CctExportProductType productType) {
        return Arrays.asList(CctExportProductType.CC, CctExportProductType.CF).contains(productType);
    }

    public static boolean isOther(CctExportProductType productType) {
        return Arrays.asList(CctExportProductType.AUTRES, CctExportProductType.COTON).contains(productType);
    }

    public static boolean isWood(CctExportProductType productType) {
        return Arrays.asList(CctExportProductType.GR, CctExportProductType.BT, CctExportProductType.OA, CctExportProductType.PS).contains(productType);
    }

}
