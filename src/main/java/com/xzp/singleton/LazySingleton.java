package com.xzp.singleton;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;

/**
 * 懒汉式单例
 * DCL(双端检锁) + volatile（禁止指令重排）
 * @author xzp
 * @date 2020.11.17 23:32
 */
public class LazySingleton {
    private static volatile LazySingleton INSTANCE;

    private LazySingleton(){
        System.out.println("构造方法");
    }

    public static LazySingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazySingleton.class){
                if(INSTANCE == null) INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentSkipListSet skipListSet = new ConcurrentSkipListSet();
        int count = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i = 0; i < count; i++){
            new Thread(() -> {
                skipListSet.add(LazySingleton.getInstance().hashCode());
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(skipListSet.size() == 1);
    }
}
