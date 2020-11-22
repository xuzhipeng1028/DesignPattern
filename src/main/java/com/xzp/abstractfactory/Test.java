package com.xzp.abstractfactory;

/**
 * @author xzp
 * @date 2020.11.22 18:08
 */
public class Test {
    public static void main(String[] args) {
        ProductFactory huaWeiProductFactory = new HuaWeiFactory();
        huaWeiProductFactory.createPhone().call();
        huaWeiProductFactory.createComputer().work();

        System.out.println("------------");

        ProductFactory xiaoMiProductFactory = new XiaoMiFactory();
        xiaoMiProductFactory.createPhone().call();
        xiaoMiProductFactory.createComputer().work();
    }
}
