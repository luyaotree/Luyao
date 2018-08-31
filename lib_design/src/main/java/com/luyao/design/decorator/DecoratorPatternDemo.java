package com.luyao.design.decorator;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/8/31
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();//Circle with normal border    Shape: Circle
        redCircle.draw();// Shape: Circle  Border Color: Red
        redRectangle.draw();
    }
}
