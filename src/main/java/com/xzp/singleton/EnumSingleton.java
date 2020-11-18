package com.xzp.singleton;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;

/**
 * 单元素枚举类实现单例
 * effective java作者推荐使用单元素枚举类实现单例，可以防止反射攻击和反序列化攻击。
 *
 * A single-element enum type is often the best way to implement a singleton.
 *
 * It is more concise, provides the serialization machinery for free,
 * and provides an ironclad guarantee against multiple instantiation,
 * even in the face of sophisticated serialization or reflection attacks.
 *
 * @author xzp
 * @date 2020.11.18 22:17
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton(){
        System.out.println("构造方法");
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentSkipListSet skipListSet = new ConcurrentSkipListSet();
        int count = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for(int i = 0; i < count; i++){
            new Thread(() -> {
                skipListSet.add(EnumSingleton.getInstance().hashCode());
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(skipListSet.size() == 1);
    }
}
