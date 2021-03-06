package com.xzp.singleton;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;

/**
 * 饿汉式单例
 * @author xzp
 * @date 2020.11.17 22:58
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("构造方法");
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentSkipListSet skipListSet = new ConcurrentSkipListSet();
        int count = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i = 0; i < count; i++){
            new Thread(() -> {
                skipListSet.add(EagerSingleton.getInstance().hashCode());
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(skipListSet.size() == 1);
    }

}
