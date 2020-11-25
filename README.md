# DesignPattern
一：singleton单例模式

- EagerSingleton 饿汉式单例，JVM保证线程安全，类加载到内存中就实例化一个单例。
- LazySingleton 懒汉式单例，DCL(双端检锁) + volatile（禁止指令重排）。
- StaticInnerClassSingleton 静态内部类实现懒加载单例，加载外部类时不会加载内部类，实现懒加载，jvm保证单例。
- EnumSingleton 单元素枚举类实现单例，可以防止反射攻击和反序列化攻击，是目前实现单例最好的方式。

二：strategy策略模式

1. 定义策略接口类;
2. 实现这个接口定义不同的策略实现类;
3. 然后只需要修改传入的策略实现类就可以实现不同的逻辑，比如支付场景，将支付宝或微信支付写成不同的策略。

三：simplefactory简单工厂模式（不属于23种设计模式）

可以有多种实现方式，比如：
- 工厂中定义一个方法，通过传入不同的参数，创建不同的对象
- 工厂中定义多个方法，每个方法只创建特定类型的对象（可以是静态方法或实例方法）

四：factorymethod工厂方法模式

1. 定义一个功能接口(Product)，根据需要创建多个功能实现类(Phone);
2. 定义一个工厂接口(ProductFactory)，创建多个工厂实现类(PhoneFactory)，每个实现类创建属于自己的功能对象;
3. 每当需要创建新功能的对象的时候，只需要新添加一个工厂实现类及功能实现类,这样可以实现对修改关闭、对扩展开放。

五：abstractfactory抽象工厂模式

抽象工厂模式在工厂方法的基础上增加了产品族的概念，比如小米有手机和电脑，华为也有手机和电脑。
1. 定义抽象产品类，比如Phone、Computer, 定义不同品牌的实现类，比如HuaWeiPhone、HuaWeiComputer、XiaoMiPhone、XiaoMiComputer;
2. 定义抽象工厂类, 类里定义多个抽象方法，用于创建不同的产品，定义多个工厂类的实现类，比如HuaWeiFactory。

六：facade门面模式

门面模式是对外提供了统一的访问入口，外部调用者只需和门面打交道。
1. 定义了cpu、memory、disk三个子模块及一个computer门面；
2. 客户端只需要调用computer的启动和关闭方法，无需关心有几个子模块需要调用。

七：mediator调停者模式

调停者模式是对内提供了统一的中间人，所有子系统只需和中间人打交道，由中间人负责转发到具体的子系统，将复杂的网状关系变为简单的星型关系，调停者位于核心。
1. 定义抽象的调停者及实现类；
2. 定义抽象的同事类及实现类；
3. a同事类调用调停者，由调停者去调用目标同事类b处理。





