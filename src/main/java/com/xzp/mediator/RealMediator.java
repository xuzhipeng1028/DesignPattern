package com.xzp.mediator;

/**
 * 具体的调停者
 * @author xzp
 * @date 2020.11.25 23:50
 */
public class RealMediator extends Mediator {
    @Override
    public void handle(Person source, Person target, String message) {
        System.out.println("调停者收到了"+source.getName()+"的请求："+message+"，并转给了"+target.getName());
        target.called(source,message);
    }
}
