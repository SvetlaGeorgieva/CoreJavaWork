package com.hackbulgaria.corejava1.generics2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {
    String author();

    int revision() default 1;

    boolean mustCheck() default true;

    Class<?>[] relatedClasses();

}
