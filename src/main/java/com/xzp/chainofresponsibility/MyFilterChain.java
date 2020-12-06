package com.xzp.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xzp
 * @date 2020.12.06 19:15
 */
public class MyFilterChain {
    private List<MyFilter> filters = new ArrayList<>();
    private int pos;

    public MyFilterChain add(MyFilter filter){
        filters.add(filter);
        return this;
    }

    public void doFilter(MyRequest request,MyResponse response){
        System.out.println("-----MyFilterChain-----");
        if(pos >= filters.size()) return;
        filters.get(pos++).doFilter(request,response,this);
    }
}
