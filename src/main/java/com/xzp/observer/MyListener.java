package com.xzp.observer;

/**
 * @author xzp
 * @date 2020.12.06 19:58
 */
public interface MyListener {
    void start(MyEvent event);
    void shutdown(MyEvent event);
}
