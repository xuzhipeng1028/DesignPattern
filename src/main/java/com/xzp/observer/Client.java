package com.xzp.observer;

/**
 * @author xzp
 * @date 2020.12.06 20:09
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.addListener(new QQListener()).addListener(new WeixinListener());

        computer.start();
        computer.shutdown();
    }
}
