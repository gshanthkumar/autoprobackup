package com.yrszone.automation.ui.utilities;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FindElements {

    String page() default "";
    String field() default "";
}
