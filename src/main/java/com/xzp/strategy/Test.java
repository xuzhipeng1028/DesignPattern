package com.xzp.strategy;

/**
 * @author xzp
 * @date 2020.11.22 16:05
 */
public class Test {
    public static void main(String[] args) {
        Travel airplane = new Travel(new AirPlaneStrategy());
        Travel train = new Travel(new TrainStrategy());
        airplane.travel();
        train.travel();
    }
}
