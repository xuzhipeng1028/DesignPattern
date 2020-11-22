# DesignPattern
一：singleton单例模式

- EagerSingleton 饿汉式单例，JVM保证线程安全，类加载到内存中就实例化一个单例。
- LazySingleton 懒汉式单例，DCL(双端检锁) + volatile（禁止指令重排）。
- StaticInnerClassSingleton 静态内部类实现懒加载单例，加载外部类时不会加载内部类，实现懒加载，jvm保证单例。
- EnumSingleton 单元素枚举类实现单例，可以防止反射攻击和反序列化攻击，是目前实现单例最好的方式。

二：strategy策略模式

1. 定义策略接口类;

2. 实现这个接口定义不同的策略实现类;
3. 然后只需要修改传入的策略实现类就可以实现不同的逻辑，比如支付场景，将支付宝或微信支付写成不同的策略