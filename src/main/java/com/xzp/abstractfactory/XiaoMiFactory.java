package com.xzp.abstractfactory;

/**
 * @author xzp
 * @date 2020.11.22 18:07
 */
public class XiaoMiFactory extends ProductFactory{
    @Override
    Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    Computer createComputer() {
        return new XiaoMiComputer();
    }
}
