package com.xzp.observer;

/**
 * @author xzp
 * @date 2020.12.06 20:05
 */
public class WeixinListener implements MyListener{
    @Override
    public void start(MyEvent event) {
        System.out.println(String.format("%s-----Weixin start-----",event.getMsg()));
    }

    @Override
    public void shutdown(MyEvent event) {
        System.out.println(String.format("%s-----Weixin shutdown-----",event.getMsg()));
    }
}
