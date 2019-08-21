package com.xncoding.pattern.visitor.standard;

/**
 * 具体的访问者实现
 */
public class ConcreteVisitor1 implements Visitor {
    public void visitConcreteElementA(ConcreteElementA element) {
        //把要访问ConcreteElementA 时，需要执行的功能实现在这里
        //可能需要访问元素已有的功能，比如：
        element.opertionA();
    }

    public void visitConcreteElementB(ConcreteElementB element) {
        //把要访问ConcreteElementB 时，需要执行的功能实现在这里
        //可能需要访问元素已有的功能，比如：
        element.opertionB();
    }
}
