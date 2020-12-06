package com.xzp.chainofresponsibility;

/**
 * @author xzp
 * @date 2020.12.06 19:36
 */
public class Client {
    public static void main(String[] args) {
        MyRequest request = new MyRequest();
        MyResponse response = new MyResponse();
//        request.setMsg("中国");
        request.setMsg("黄");

        MyFilterChain filterChain = new MyFilterChain();
        filterChain.add(new SensitiveWordFilter()).add(new HtmlFilter());

        filterChain.doFilter(request,response);
    }
}
