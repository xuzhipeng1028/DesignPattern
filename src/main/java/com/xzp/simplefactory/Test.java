package com.xzp.simplefactory;

/**
 * @author xzp
 * @date 2020.11.22 17:05
 */
public class Test {
    public static void main(String[] args) {
        Product phoneProduct = SimpleFactory.createProduct(ProductType.PHONE);
        phoneProduct.play();
        Product computerProduct = SimpleFactory.createProduct(ProductType.COMPUTER);
        computerProduct.play();

        System.out.println("---------------------");

        Product phone = SimpleFactory.createPhone();
        phone.play();
        Product computer = SimpleFactory.createComputer();
        computer.play();
    }
}
