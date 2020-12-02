package com.xzp.decorator;

/**
 * @author xzp
 * @date 2020.12.02 23:38
 */
public class RedDecorator extends ShapeDecorator{

    public RedDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("red color");
    }
}
