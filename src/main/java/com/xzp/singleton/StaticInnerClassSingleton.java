package com.xzp.singleton;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;

/**
 * 静态内部类实现懒加载单例
 * 加载外部类时不会加载内部类，实现懒加载
 * jvm保证单例
 * @author xzp
 * @date 2020.11.18 22:06
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        System.out.println("构造方法");
    }

    private static class MyInnerClass {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return MyInnerClass.INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentSkipListSet skipListSet = new ConcurrentSkipListSet();
        int count = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i = 0; i < count; i++){
            new Thread(() -> {
                skipListSet.add(StaticInnerClassSingleton.getInstance().hashCode());
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(skipListSet.size() == 1);
    }
}
