package com.luyao.aop.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/3/23
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface BehavioClass {
}
