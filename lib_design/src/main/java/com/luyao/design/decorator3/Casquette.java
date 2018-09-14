package com.luyao.design.decorator3;

/**
 * 描述：同ClothingDecorator
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Casquette extends HatDecorator{

    Person person;

    public Casquette(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription() + " a casquette ";
    }

    @Override
    public double cost() {
        return 75 + person.cost();
    }
}
