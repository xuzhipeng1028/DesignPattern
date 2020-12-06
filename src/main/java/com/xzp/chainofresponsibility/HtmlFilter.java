package com.xzp.chainofresponsibility;

/**
 * @author xzp
 * @date 2020.12.06 19:26
 */
public class HtmlFilter implements MyFilter{
    @Override
    public void doFilter(MyRequest request, MyResponse response, MyFilterChain filterChain) {
        System.out.println("-----HtmlFilter-----");
        if(request != null && request.getMsg() != null) {
            request.getMsg().replace('<','[')
                    .replace('>',']');
            filterChain.doFilter(request,response);
        }
    }
}
