package com.xzp.mediator;

/**
 * @author xzp
 * @date 2020.11.25 23:44
 */
public abstract class Person {
    private String name;
    private Mediator mediator;
    public Person(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
    public void called(Person person,String message){
        System.out.println(this.name + "收到了"+person.getName()+"的请求："+message);
    }
    public void ask(Person person,String message){
        System.out.println(name + "向"+person.getName()+"发起请求：" + message);
        mediator.handle(this,person,message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
