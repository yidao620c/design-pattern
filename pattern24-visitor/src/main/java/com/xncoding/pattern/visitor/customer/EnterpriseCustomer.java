package com.xncoding.pattern.visitor.customer;

import lombok.Data;

@Data
public class EnterpriseCustomer extends Customer{
    private String linkman;
    private String linkTelephone;
    private String registerAddress;
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitEnterpriseCustomer(this);
    }
}