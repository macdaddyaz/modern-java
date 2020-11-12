package com.notaneye.learn.java8.annotation;


import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Retention(RUNTIME)
public @interface Superlatives {

    Superlative[] value();
}
