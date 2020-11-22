package com.xzp.factorymethod;

/**
 * @author xzp
 * @date 2020.11.22 17:02
 */
public class Phone implements Product {
    @Override
    public void play() {
        System.out.println("玩手机");
    }
}
