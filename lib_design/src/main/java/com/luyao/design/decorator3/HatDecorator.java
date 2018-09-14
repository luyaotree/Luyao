package com.luyao.design.decorator3;

/**
 * 描述：创建Decorator, 也是Persond的子类，是装饰者共同实现的抽象类
 *
 * @author luyao
 * @date 2018/8/31
 */
public abstract class HatDecorator extends Person {

    public abstract String getDescription();

}
