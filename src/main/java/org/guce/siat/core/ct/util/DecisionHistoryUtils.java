package org.guce.siat.core.ct.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.persistence.Column;
import javax.persistence.Temporal;
import org.apache.commons.lang.BooleanUtils;
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

}

