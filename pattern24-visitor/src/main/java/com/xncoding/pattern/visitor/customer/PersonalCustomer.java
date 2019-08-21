package com.xncoding.pattern.visitor.customer;

import lombok.Data;

@Data
public class PersonalCustomer extends Customer {
    private String telephone;
    private int age;

    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitPersonalCustomer(this);
    }
}