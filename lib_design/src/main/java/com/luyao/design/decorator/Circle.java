package com.luyao.design.decorator;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/8/31
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
