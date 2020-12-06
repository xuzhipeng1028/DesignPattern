package com.xzp.chainofresponsibility;

/**
 * @author xzp
 * @date 2020.12.06 19:00
 */
public interface MyFilter {
    void doFilter(MyRequest request, MyResponse response, MyFilterChain filterChain);
}
