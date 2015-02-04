package com.github.easyadapter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created with Android Studio
 * User: Xaver
 * Date: 30/01/15
 */
@Target(ElementType.METHOD)
public @interface OnCheckedChanged {
    public int value();
}