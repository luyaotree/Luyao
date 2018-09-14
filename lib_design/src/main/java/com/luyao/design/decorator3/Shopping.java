package com.luyao.design.decorator3;

/**
 * 描述：参考：https://blog.csdn.net/a553181867/article/details/52108423
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Shopping {

    public static void main(String[] args) {
        Person person = new Teenager();
        person = new Shirt(person);
        person = new Casquette(person);
        System.out.println("" + person.getDescription() + " 花了 " + person.cost());
    }
}
