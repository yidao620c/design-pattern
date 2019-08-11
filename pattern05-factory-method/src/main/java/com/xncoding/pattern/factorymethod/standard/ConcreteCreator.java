package com.xncoding.pattern.factorymethod.standard;

/**
 * 具体的创建器实现对象
 */
public class ConcreteCreator extends Creator {
    protected Product factoryMethod() {
        //重定义工厂方法，返回一个具体的Product 对象
        return new ConcreteProduct();
    }
}