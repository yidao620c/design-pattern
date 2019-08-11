package com.xncoding.pattern.prototype;

/**
 * 订单的接口，声明了可以克隆自身的方法
 */
public interface OrderApi {

    public int getOrderProductNum();

    public void setOrderProductNum(int num);

    public OrderApi cloneOrder();

}
