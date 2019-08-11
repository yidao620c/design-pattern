package com.xncoding.com.pattern.abstractfactory;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory {
    /**
     * 示例方法，创建抽象产品A 的对象
     * @return 抽象产品A 的对象
     */
    public AbstractProductA createProductA();
    /**
     * 示例方法，创建抽象产品B 的对象
     * @return 抽象产品B 的对象
     */
    public AbstractProductB createProductB();
}