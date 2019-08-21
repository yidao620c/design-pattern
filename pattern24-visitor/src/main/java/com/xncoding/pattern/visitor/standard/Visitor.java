package com.xncoding.pattern.visitor.standard;

/**
 * 访问者接口
 */
public interface Visitor {
    /**
     * 访问元素A，相当于给元素A 添加访问者的功能
     *
     * @param elementA 元素A 的对象
     */
    public void visitConcreteElementA(ConcreteElementA elementA);

    /**
     * 访问元素B，相当于给元素B 添加访问者的功能
     *
     * @param elementB 元素B 的对象
     */
    public void visitConcreteElementB(ConcreteElementB elementB);
}
