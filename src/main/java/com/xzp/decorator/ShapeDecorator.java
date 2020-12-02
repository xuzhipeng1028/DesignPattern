package com.xzp.decorator;

/**
 * @author xzp
 * @date 2020.12.03 00:01
 */
public abstract class ShapeDecorator extends Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
}
