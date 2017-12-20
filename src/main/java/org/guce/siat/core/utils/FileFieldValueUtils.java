/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guce.siat.core.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.beanutils.NestedNullException;


/**
 * The Class FileFieldValueUtils.
 *
 * @author Gildas AYEFOU
 */
public final class FileFieldValueUtils {

	/** The Constant FIELD_TYPE_DATE. */
	public static final int FIELD_TYPE_DATE = 1;

	/** The Constant FIELD_TYPE_DATE_UTC. */
	public static final int FIELD_TYPE_DATE_UTC = 2;

	/** The Constant FIELD_TYPE_STRING. */
	public static final int FIELD_TYPE_STRING = 3;

	/**
	 * Instantiates a new file field value utils.
	 */
	private FileFieldValueUtils() {
	}

	/**
	 * Retrieve value.
	 *
	 * @param object
	 *           the object
	 * @param path
	 *           the path
	 * @param type
	 *           the type
	 * @return the string
	 */
	public static String retrieveValue(final Object object, final String path, final Integer type) {
		String res = null;
		try {
			//String beanPath = path.replaceAll("\\s*", ".");
			String beanPath = path.replaceAll("__", ".");
			beanPath = beanPath.replaceAll("_", "");
			res = (String) getProperty(object, beanPath);
			if (type != null) {
				switch (type) {
					case FIELD_TYPE_DATE:
						res = org.guce.siat.common.utils.FileFieldValueUtils.formatDatePattern(res);
						break;
					case FIELD_TYPE_DATE_UTC:
						res = org.guce.siat.common.utils.FileFieldValueUtils.formatDateSignatairePattern(res);
						break;
				}
			}
		} catch (final Exception ex) {
			Logger.getLogger(FileFieldValueUtils.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			return res;
		}
	}

	/**
	 * Gets the property.
	 *
	 * @param bean
	 *           the bean
	 * @param name
	 *           the name
	 * @return the property
	 * @throws IllegalAccessException
	 *            the illegal access exception
	 * @throws InvocationTargetException
	 *            the invocation target exception
	 * @throws NoSuchMethodException
	 *            the no such method exception
	 */
	public static Object getProperty(final Object bean, final String name)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Object o = null;
		try {
			o = org.apache.commons.beanutils.PropertyUtils.getProperty(bean, name);
		} catch (final NestedNullException e) {
		}
		finally {
			return o;
		}
		
	}
}
