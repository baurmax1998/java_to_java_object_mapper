package de.cherry;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by mbaaxur on 13.02.17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD})
public @interface Column {

    String   name() default "";

}
