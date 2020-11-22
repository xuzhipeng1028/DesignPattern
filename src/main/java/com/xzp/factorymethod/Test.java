package com.xzp.factorymethod;

/**
 * @author xzp
 * @date 2020.11.22 17:25
 */
public class Test {
    public static void main(String[] args) {
        ProductFactory phoneFactory = new PhoneFactory();
        Product phone = phoneFactory.create();
        phone.play();

        System.out.println("---------");

        ProductFactory computerFactory = new ComputerFactory();
        Product computer = computerFactory.create();
        computer.play();
    }
}
