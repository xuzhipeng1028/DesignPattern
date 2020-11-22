package com.xzp.simplefactory;

/**
 * @author xzp
 * @date 2020.11.22 17:03
 */
public class Computer implements Product{
    @Override
    public void play() {
        System.out.println("玩电脑");
    }
}
