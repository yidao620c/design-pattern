package com.xncoding.com.pattern.abstractfactory;

/**
 * ConcreteFactory1
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
