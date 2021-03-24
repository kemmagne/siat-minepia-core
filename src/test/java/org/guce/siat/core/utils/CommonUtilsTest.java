package org.guce.siat.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.core.ct.model.InspectionReport;
import org.guce.siat.core.ct.model.UserCctExportProductType;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author tadzotsa
 */
public class CommonUtilsTest {

    @Ignore
    @Test
    public void test() throws Exception {
        final InspectionReport ir = new InspectionReport();
        ir.setTreatmentTypesList(Arrays.asList("A", "B", "C"));
        ir.setStorageEnvsList(Arrays.asList("A", "B", "C"));
        final InspectionReport irClone = CommonUtils.clone(ir);
        irClone.prePersist();
        System.out.println(irClone.getTreatmentTypes());
        System.out.println(irClone.getTreatmentTypesList());
        System.out.println(irClone.getStorageEnvs());
        System.out.println(irClone.getStorageEnvsList());
    }

    @Ignore
    @Test
    public void testGetInsertQuery() {
        Class clazz = UserCctExportProductType.class;
        Map<String, Object> map = new HashMap<>();
        map.put("user", 1);
        map.put("productType", CctExportProductType.AUTRES);
        System.out.println(save(clazz, map));
    }

    @Ignore
    @Test
    public void testGetDeleteQuery() {
        Class clazz = UserCctExportProductType.class;
        Map<String, Object> map = new HashMap<>();
        map.put("user", 1);
        map.put("productType", CctExportProductType.AUTRES);
        System.out.println(remove(clazz, map));
    }

    private String save(Class clazz, Map<String, Object> map) {

        String queryFormat = "INSERT INTO {0} ({1}) VALUES ({2});";
        String table = getTableName(clazz);
        if (table == null) {
            return null;
        }

        List<String> columnNames = new ArrayList<>();
        List<Object> values = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            columnNames.add(getColumnName(clazz, key));
            Object value = entry.getValue();
            values.add(String.format("'%s'", value));
        }

        String finalQuery = MessageFormat.format(queryFormat, table, StringUtils.join(columnNames, ','), StringUtils.join(values, ','));

        return finalQuery;
    }

    private String remove(Class clazz, Map<String, Object> map) {

        String queryFormat = "DELETE FROM {0} WHERE {1};";
        String table = getTableName(clazz);
        if (table == null) {
            return null;
        }

        List<String> whereParts = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            whereParts.add(String.format("%s = '%s'", getColumnName(clazz, key), value));
        }

        String finalQuery = MessageFormat.format(queryFormat, table, StringUtils.join(whereParts, " AND "));

        return finalQuery;
    }

    private Object getId(Class clazz, Object entity) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Id.class)) {
                try {
                    Method method = clazz.getMethod("get".concat(StringUtils.capitalize(field.getName())));
                    return method.invoke(entity);
                } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                }
            }
        }

        return null;
    }

    private String getTableName(Class clazz) {
        Table table = (Table) clazz.getAnnotation(Table.class);
        if (table != null) {
            return table.name();
        }
        return null;
    }

    private String getColumnName(Class clazz, String fieldName) {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            Column c = field.getAnnotation(Column.class);
            if (c != null) {
                return c.name();
            } else {
                JoinColumn jc = field.getAnnotation(JoinColumn.class);
                if (jc != null) {
                    return jc.name();
                }
            }
        } catch (NoSuchFieldException | SecurityException ex) {
        }

        return null;
    }

    @Test
    public void testCollectionsSubtraction() {
        System.out.println("org.guce.siat.core.utils.CommonUtilsTest.testCollectionsSubtraction()");
        List<Long> list1 = Arrays.asList(1l, 4l, 5l);
        List<Long> list2 = Arrays.asList(2l, 1l, 3l, 6l, 13l, 10l, 9l, 4l);
        System.out.println(CollectionUtils.subtract(list1, list2));
        System.out.println(CollectionUtils.subtract(list2, list1));
        System.out.println(CollectionUtils.subtract(Arrays.asList(), list1));
        System.out.println(CollectionUtils.subtract(Arrays.asList(), list2));
    }

    @Test
    public void tes() {
        String s = "20210222175805-r.e.pdf";
        if (s.matches("\\d{14}-.*")) {
            String s1 = s.substring(15);
            System.out.println(s1);
        }
    }

}
