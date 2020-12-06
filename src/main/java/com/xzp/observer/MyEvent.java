package com.xzp.observer;

/**
 * @author xzp
 * @date 2020.12.06 20:03
 */
public class MyEvent {
    private Object source;
    String msg;

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
