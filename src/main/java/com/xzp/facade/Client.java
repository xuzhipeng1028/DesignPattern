package com.xzp.facade;

/**
 * @author xzp
 * @date 2020.11.25 23:02
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
