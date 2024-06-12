package com.switchfully.config;

import org.apiguardian.api.API;
import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope(org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope.NAME)
@API(status = API.Status.STABLE)
public @interface WebDriverScope {

}
