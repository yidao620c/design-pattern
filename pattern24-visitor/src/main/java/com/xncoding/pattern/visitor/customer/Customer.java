package com.xncoding.pattern.visitor.customer;

import lombok.Data;

@Data
public abstract class Customer {
    private String customerId;
    private String name;

    /**
     * 接受访问者的访问
     *
     * @param visitor 访问者对象
     */
    public abstract void accept(Visitor visitor);
}