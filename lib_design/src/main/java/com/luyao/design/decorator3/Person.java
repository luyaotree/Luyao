package com.luyao.design.decorator3;

/**
 * 描述：创建Component基类
 *
 * @author luyao
 * @date 2018/8/31
 */
public abstract class Person {
    String description = "Unknow";

    public String getDescription() {
        return description;
    }

    public abstract double cost(); // 子类应该实现的方法
}
