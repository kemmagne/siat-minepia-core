package org.guce.siat.core.ct.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.persistence.Column;
import javax.persistence.Temporal;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.orchestra.util.JAXBUtil;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.core.ct.util.annotations.CustomProperty;
import org.guce.siat.core.ct.util.enums.DEFAULT;
import org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author tadzotsa
 */
public class DecisionHistoryUtils {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(DecisionHistoryUtils.class);

    public static <E extends AbstractModel> org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT putDecisionHistories(org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document,
            E entity, final String fileTypeCode) {

        if (entity == null) {
            return document;
        }

        document.getCONTENT().setDETAILSDECISIONSSIAT(new DOCUMENT.CONTENT.DETAILSDECISIONSSIAT());

        final Properties properties = new Properties();

        try {
            properties.load(new ClassPathResource("org/guce/siat/messages/locale_fr.properties").getInputStream());
        } catch (IOException ex) {
            LOG.error(null, ex);
            return document;
        }

        final Class clazz = entity.getClass();
        final Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {

            if (!field.isAnnotationPresent(CustomProperty.class)) {
                continue;
            }

            final DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION detailsdecision = new DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION();
            final CustomProperty property = field.getAnnotation(CustomProperty.class);
            final Column column = field.getAnnotation(Column.class);

            final String fieldName = field.getName();
            final Class fieldType = field.getType();
            final String getter;
            if (!boolean.class.equals(fieldType)) {
                getter = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            } else {
                getter = "is" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            }
            try {
                Object value;
                try {
                    final Method method = clazz.getMethod(getter);
                    value = method.invoke(entity);
                    if (value == null) {
                        continue;
                    }
                } catch (NoSuchMethodException ex) {
                    continue;
                }

                final Class enumClass = property.enumClass();
                if (boolean.class.equals(value.getClass()) || Boolean.class.equals(value.getClass())) {
                    detailsdecision.setVALEUR(BooleanUtils.toBoolean(value.toString()) ? "Oui" : "Non");
                } else if (!DEFAULT.class.equals(property.enumClass())) {

                    final Method valueOfMethod = enumClass.getMethod("valueOf", String.class);
                    final Object enumEntity = valueOfMethod.invoke(enumClass, value.toString());

                    String label;
                    try {
                        final Method getLabelMethod = enumClass.getMethod("getLabel");
                        final Object labelObject = getLabelMethod.invoke(enumEntity);
                        label = labelObject.toString();
                    } catch (NoSuchMethodException ex) {
                        label = value.toString();
                    }

                    detailsdecision.setVALEUR(properties.getProperty(label, label));
                } else if (Date.class.equals(fieldType)) {
                    final Temporal temporal = field.getAnnotation(Temporal.class);
                    if (null != temporal.value()) {
                        switch (temporal.value()) {
                            case DATE:
                                detailsdecision.setVALEUR(new SimpleDateFormat("dd/MM/yyyy").format((Date) value));
                                break;
                            case TIME:
                                detailsdecision.setVALEUR(new SimpleDateFormat("HH:mm").format((Date) value));
                                break;
                            case TIMESTAMP:
                                detailsdecision.setVALEUR(new SimpleDateFormat("dd/MM/yyyy HH:mm").format((Date) value));
                        }
                    }
                } else {
                    detailsdecision.setVALEUR(value.toString());
                }
            } catch (Exception ex) {
                LOG.error(null, ex);
                return document;
            }

            detailsdecision.setCODE(column.name());
            detailsdecision.setCODEPROCEDURESIAT(fileTypeCode);
            detailsdecision.setLABELEN(property.labelEn());
            detailsdecision.setLABELFR(property.labelFr());

            document.getCONTENT().getDETAILSDECISIONSSIAT().getDETAILSDECISION().add(detailsdecision);
        }

        return document;
    }

    private DecisionHistoryUtils() {
    }

    public static void main(String[] args) throws Exception {
        org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document = JAXBUtil.unmarshall(
                new FileInputStream("C:\\Users\\tadzotsa\\Downloads\\CTE001.xml"),
                org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.class, false);
        List<DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> oldConteneurs = document.getCONTENT().getCONTENEURS().getCONTENEUR();
        List<DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> conteneurs = new ArrayList<>();
        List<String> contNbs = new ArrayList<>();
        System.out.println("before : " + oldConteneurs.size());
        for (DOCUMENT.CONTENT.CONTENEURS.CONTENEUR conteneur : oldConteneurs) {
            String contNb = conteneur.getNUMERO();
            if (contNbs.contains(contNb)) {
                continue;
            }
            contNbs.add(contNb);
            conteneurs.add(conteneur);
        }
        document.getCONTENT().getCONTENEURS().getCONTENEUR().clear();
        document.getCONTENT().getCONTENEURS().getCONTENEUR().addAll(conteneurs);
        System.out.println("in document : " + document.getCONTENT().getCONTENEURS().getCONTENEUR().size());

        final List<String> columns = new ArrayList<>();
        columns.add("Numéro");
        columns.add("Scellés");
        columns.add("Type");
        columns.add("Volume");
        columns.add("Tonnage");
        columns.add("Marque");
        columns.add("Quantité colis");
        columns.add("Essence");

        final List<String> filedsValuesList = new ArrayList<>();
        final int elementSize = document.getCONTENT().getCONTENEURS().getCONTENEUR().size();
        for (int i = 0; i < elementSize; i++) {
            if (document.getCONTENT().getCONTENEURS().getCONTENEUR().get(i) != null) {
                final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR currentEssai = document.getCONTENT().getCONTENEURS().getCONTENEUR().get(i);
                filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getNUMERO()) ? currentEssai.getNUMERO() : "-");
                filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getSCELLE1()) ? currentEssai.getSCELLE1() : "-");
                filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getTYPE()) ? currentEssai.getTYPE() : "-");
                filedsValuesList.add(currentEssai.getVOLUME() != null ? currentEssai.getVOLUME().toString() : "-");
                filedsValuesList.add(currentEssai.getTONNAGE() != null ? currentEssai.getTONNAGE().toString() : "-");
                filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getMARQUE()) ? currentEssai.getMARQUE() : "-");
                filedsValuesList.add(currentEssai.getQUANTITECOLIS() != null ? currentEssai.getQUANTITECOLIS().toString() : "-");
                filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getESSENCE()) ? currentEssai.getESSENCE() : "-");
            }
        }
        System.out.println(addValueRepetable(filedsValuesList, columns, null));
    }

    private static String addValueRepetable(final List<String> values, final List<String> columns, final List<String> fks) {
        final StringBuilder analyseValuesBuilder = new StringBuilder();
        final String col = ",";
        final String row = ";";
        final String fk = "#;";
        for (int i = 0; i < columns.size(); i++) {
            analyseValuesBuilder.append(columns.get(i));
            if (i != columns.size() - 1) {
                analyseValuesBuilder.append(col);
            }
            if (i == columns.size() - 1 && fks != null) {
                analyseValuesBuilder.append(col);
                analyseValuesBuilder.append(fk);
            }

        }
        /**
         * * S'il existe des bloc repétable niveau 1 **
         */
        if (fks != null) {
            for (int i = 0; i < fks.size(); i++) {
                analyseValuesBuilder.append(fks.get(i));
                if (i != fks.size() - 1) {
                    analyseValuesBuilder.append(col);
                }
            }
        }

        int j = 1;
        analyseValuesBuilder.append(row);
        for (int i = 0; i < values.size(); i++) {

            analyseValuesBuilder.append(values.get(i));
            if (j == columns.size()) {
                analyseValuesBuilder.append(row);
                j = 1;
            } else {
                analyseValuesBuilder.append(col);
                j++;
            }

        }

        return analyseValuesBuilder.toString();
    }

}
