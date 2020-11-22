package com.xzp.abstractfactory;

/**
 * @author xzp
 * @date 2020.11.22 18:07
 */
public class HuaWeiFactory extends ProductFactory{
    @Override
    Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    Computer createComputer() {
        return new HuaWeiComputer();
    }
}
