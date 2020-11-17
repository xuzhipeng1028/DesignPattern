package com.xzp.singleton;

/**
 * 饿汉式单例
 * @author xzp
 * @date 2020.11.17 22:58
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
