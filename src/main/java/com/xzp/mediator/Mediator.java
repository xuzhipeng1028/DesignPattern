package com.xzp.mediator;

/**
 * 抽象调停者
 * @author xzp
 * @date 2020.11.25 23:42
 */
public abstract class Mediator {
    public abstract void handle(Person source,Person target,String message);
}
