package com.xzp.abstractfactory;

/**
 * @author xzp
 * @date 2020.11.22 18:06
 */
public abstract class ProductFactory {
    abstract Phone createPhone();
    abstract Computer createComputer();
}
