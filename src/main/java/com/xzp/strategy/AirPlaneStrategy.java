package com.xzp.strategy;

/**
 * 乘坐飞机
 * @author xzp
 * @date 2020.11.22 16:03
 */
public class AirPlaneStrategy implements VehicleStrategy{
    @Override
    public void go() {
        System.out.println("乘坐飞机");
    }
}
