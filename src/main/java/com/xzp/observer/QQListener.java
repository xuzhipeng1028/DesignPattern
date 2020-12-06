package com.xzp.observer;

/**
 * @author xzp
 * @date 2020.12.06 20:00
 */
public class QQListener implements MyListener{

    @Override
    public void start(MyEvent event) {
        System.out.println(String.format("%s-----QQ start-----",event.getMsg()));
    }

    @Override
    public void shutdown(MyEvent event) {
        System.out.println(String.format("%s-----QQ shutdown-----",event.getMsg()));
    }
}
