package com.luyao.design.decorator;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/8/31
 */
public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
