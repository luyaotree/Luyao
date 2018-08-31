package com.luyao.design.decorator;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/8/31
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
