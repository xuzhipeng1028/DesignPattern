package com.xzp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xzp
 * @date 2020.12.06 20:06
 */
public class Computer {
    private List<MyListener> listeners = new ArrayList<>();

    public Computer addListener(MyListener listener){
        this.listeners.add(listener);
        return this;
    }

    public void start(){
        MyEvent event = new MyEvent();
        event.setSource(this);
        event.setMsg("computer start");
        for(MyListener listener : listeners){
            listener.start(event);
        }
    }

    public void shutdown(){
        MyEvent event = new MyEvent();
        event.setSource(this);
        event.setMsg("computer shutdown");
        for(MyListener listener : listeners){
            listener.shutdown(event);
        }
    }
}
