package com.xzp.simplefactory;

/**
 * 简单工厂
 * @author xzp
 * @date 2020.11.22 17:04
 */
public class SimpleFactory {

    public static Product createProduct(ProductType productType){
        switch (productType) {
            case PHONE:
                return new Phone();
            case COMPUTER:
                return new Computer();
            default:
                throw new RuntimeException();
        }
    }

    public static Product createPhone(){
        return new Phone();
    }

    public static Product createComputer(){
        return new Computer();
    }
}
