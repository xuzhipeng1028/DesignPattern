package com.xzp.decorator;

/**
 * @author xzp
 * @date 2020.12.02 23:41
 */
public class DottedLineDecorator extends ShapeDecorator{
    public DottedLineDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("dotted line");
    }
}
