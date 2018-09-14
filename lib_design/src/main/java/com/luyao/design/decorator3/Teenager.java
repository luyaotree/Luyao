package com.luyao.design.decorator3;

/**
 * 描述：创建被装饰者 - ConcreteComponent
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Teenager extends Person {

    public Teenager() {
        description = "Shopping List: ";
    }

    @Override
    public double cost() {
        //什么都没买，不用钱
        return 0;
    }
}
