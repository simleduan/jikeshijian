package com.study.annocation;import java.lang.annotation.*;@Target(ElementType.TYPE)@Retention(RetentionPolicy.RUNTIME)@Documented@Inheritedpublic @interface DBTable {    String value() default "";}