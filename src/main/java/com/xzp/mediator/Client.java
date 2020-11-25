package com.xzp.mediator;

/**
 * @author xzp
 * @date 2020.11.25 23:56
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new RealMediator();
        Person personA = new RealPerson("personA",mediator);
        Person personB = new RealPerson("personB",mediator);
        personA.ask(personB,"给我回个消息");
    }
}
