package com.notaneye.learn.java8.annotation;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Repeatable(Superlatives.class)
@Retention(RUNTIME)
public @interface Superlative {

    Value value();

    enum Value {
        SWEET,
        AWESOME,
        DA_BOMB,
    }
}
