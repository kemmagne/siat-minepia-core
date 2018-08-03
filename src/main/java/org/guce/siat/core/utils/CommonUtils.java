package org.guce.siat.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import org.guce.siat.core.ct.model.InspectionReport;
import org.guce.siat.core.ct.model.TreatmentResult;

/**
 *
 * @author tadzotsa
 */
public class CommonUtils {

    private CommonUtils() {
    }

    public static <E> E clone(E source) throws Exception {
        final Class clazz = source.getClass();

        Object target = clazz.newInstance();

        final Field[] fields = clazz.getDeclaredFields();
        for (final Field field : fields) {
            if (!field.isAnnotationPresent(Column.class) && !field.isAnnotationPresent(JoinColumn.class)) {
                continue;
            }
            final String fieldName = field.getName();
            final String getter = (!"boolean".equals(field.getType().getName()) ? "get" : "is")
                    + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            final Method getterMethod = clazz.getMethod(getter);
            final Object value = getterMethod.invoke(source);
            final String setter = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            final Method setterMethod = clazz.getMethod(setter, field.getType());
            setterMethod.invoke(target, value);
        }

        return (E) target;
    }

}
