package com.xzp.factorymethod;

/**
 * @author xzp
 * @date 2020.11.22 17:25
 */
public class ComputerFactory implements ProductFactory{
    @Override
    public Product create() {
        return new Computer();
    }
}
