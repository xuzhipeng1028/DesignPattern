package com.xzp.factorymethod;

/**
 * @author xzp
 * @date 2020.11.22 17:24
 */
public class PhoneFactory implements ProductFactory{
    @Override
    public Product create() {
        return new Phone();
    }
}
