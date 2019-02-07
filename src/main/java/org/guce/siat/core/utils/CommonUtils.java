package org.guce.siat.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author tadzotsa
 */
public class CommonUtils {

    public static <E> E clone(E source) throws Exception {

        final Class clazz = source.getClass();
        final Object result = clazz.newInstance();

        final Field[] allFields = clazz.getDeclaredFields();
        for (final Field field : allFields) {

            if (field.isAnnotationPresent(Column.class) || field.isAnnotationPresent(JoinColumn.class)
                    || field.isAnnotationPresent(OneToMany.class) || field.isAnnotationPresent(Transient.class)) {

                final String fieldName = field.getName();
                final String getter = (!"boolean".equals(field.getType().getName()) ? "get" : "is")
                        + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                final Method getterMethod = clazz.getMethod(getter);
                final Object value = getterMethod.invoke(source);
                final String setter = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                final Method setterMethod = clazz.getMethod(setter, field.getType());
                setterMethod.invoke(result, value);
            }
        }

        return (E) result;
    }

    private CommonUtils() {
    }

}

