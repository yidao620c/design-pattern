## 简单工厂模式

所谓组件：从设计上讲，组件就是能完成一定功能的封装体。小到一个类，大到一个系统，都可以称为组件，
因为一个小系统放到更大的系统里面去，也就当个组件而已。

**模式定义：**

提供一个创建对象实例的功能，而无须关心其具体实现。被创建实例的类型可以是接口、抽象类，也可以是具体的类。

## 优点
1. 帮助封装
简单工厂虽然很简单，但是非常友好地帮助我们实现了组件的封装，然后让组件外部能真正面向接口编程。
2. 解耦
通过简单工厂，实现了客户端和具体实现类的解耦。
如同上面的例子，客户端根本就不知道具体是由谁来实现，也不知道具体是如何实现的，客户端只是通过工厂获取它需要的接口对象。

## 缺点
1. 可能增加客户端的复杂度
如果通过客户端的参数来选择具体的实现类，那么就必须让客户端能理解各个参数所代表的具体功能和含义，
这样会增加客户端使用的难度，也部分暴露了内部实现，这种情况可以选用可配置的方式来实现。
2. 不方便扩展子工厂
私有化简单工厂的构造方法，使用静态方法来创建接口，也就不能通过写简单工厂类的子类来改变创建接口的方法的行为了。
不过，通常情况下是不需要为简单工厂创建子类的。

## 使用场景

简单工厂的本质是：选择实现。

建议在以下情况中选用简单工厂。

1. 如果想要完全封装隔离具体实现，让外部只能通过接口来操作封装体，那么可以选用简单工厂，
让客户端通过工厂来获取相应的接口，而无须关心具体的实现。
2. 如果想要把对外创建对象的职责集中管理和控制，可以选用简单工厂，一个简单工厂可以创建很多的、不相关的对象，
可以把对外创建对象的职责集中到一个简单工厂来，从而实现集中管理和控制。
