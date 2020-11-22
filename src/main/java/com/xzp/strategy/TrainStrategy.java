package com.xzp.strategy;

/**
 * 乘坐火车
 * @author xzp
 * @date 2020.11.22 16:04
 */
public class TrainStrategy implements VehicleStrategy{
    @Override
    public void go() {
        System.out.println("乘坐火车");
    }
}
