package org.guce.siat.core.ct.util.annotations;

import org.guce.siat.core.ct.util.enums.DEFAULT;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author tadzotsa
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface CustomProperty {

    /**
     * the code of the property
     *
     * @return
     */
//    String code();
    /**
     * the label in french
     *
     * @return
     */
    String labelFr();

    /**
     * the label in english
     *
     * @return
     */
    String labelEn();

    Class enumClass() default DEFAULT.class;

    /**
     * the value of the property
     *
     * @return
     */
//    String value();
}
