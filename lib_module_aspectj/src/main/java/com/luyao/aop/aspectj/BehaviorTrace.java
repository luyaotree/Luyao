package com.luyao.aop.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/3/5
 */
@Target(ElementType.METHOD) // 修饰的是方法
@Retention(RetentionPolicy.CLASS) // 编译时注解
public @interface BehaviorTrace {
    String value(); // 功能点名称
    int type(); // 唯一确定功能点的值
}


