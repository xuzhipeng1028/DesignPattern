# DesignPattern
一：singleton单例模式

- EagerSingleton 饿汉式单例，JVM保证线程安全，类加载到内存中就实例化一个单例。
- LazySingleton 懒汉式单例，DCL(双端检锁) + volatile（禁止指令重排）。
- StaticInnerClassSingleton 静态内部类实现懒加载单例，加载外部类时不会加载内部类，实现懒加载，jvm保证单例。
- EnumSingleton 单元素枚举类实现单例，可以防止反射攻击和反序列化攻击，是目前实现单例最好的方式。