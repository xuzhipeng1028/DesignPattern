package com.xzp.decorator;

/**
 * @author xzp
 * @date 2020.12.02 23:42
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redDecorator = new RedDecorator(circle);
        Shape dottedLineDecorator = new DottedLineDecorator(redDecorator);
        dottedLineDecorator.draw();

        System.out.println("----------------------");
        Shape circle1 = new Circle();
        Shape dottedLineDecorator1 = new DottedLineDecorator(circle1);
        Shape redDecorator1 = new RedDecorator(dottedLineDecorator1);
        redDecorator1.draw();
    }
}
