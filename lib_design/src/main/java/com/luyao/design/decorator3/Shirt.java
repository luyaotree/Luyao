package com.luyao.design.decorator3;

/**
 * 描述：是Decorator的子类，具体的装饰者，可以方便的扩展的Component
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Shirt extends ClothingDecorator{

    Person person;

    public Shirt(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription() + " a shirt ";
    }

    @Override
    public double cost() {
        return 100 + person.cost();
    }
}
