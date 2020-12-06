package com.xzp.chainofresponsibility;

/**
 * @author xzp
 * @date 2020.12.06 19:32
 */
public class SensitiveWordFilter implements MyFilter{
    @Override
    public void doFilter(MyRequest request, MyResponse response, MyFilterChain filterChain) {
        System.out.println("-----SensitiveWordFilter-----");
        if(request != null && request.getMsg() != null){
            if(request.getMsg().contains("黄")){
                return;
            }
            filterChain.doFilter(request,response);
        }
    }
}
