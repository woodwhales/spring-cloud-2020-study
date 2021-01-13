package cn.woodwhales.springcloud.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author woodwhales on 2021-01-13 19:48
 * @description 排除component扫描的标记注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ExcludeFromComponentScan {

}