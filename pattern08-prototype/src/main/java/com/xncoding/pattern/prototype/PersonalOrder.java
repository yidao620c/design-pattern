package com.xncoding.pattern.prototype;

/**
 * 个人订单对象
 */
public class PersonalOrder implements Cloneable, OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum = 0;

    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        return clone();
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String toString() {
        return "本个人订单的订购人是=" + this.customerName
                + "，订购产品是=" + this.productId + "，订购数量为="
                + this.orderProductNum;
    }

    public PersonalOrder clone() {
        PersonalOrder obj = null;
        try {
            obj = (PersonalOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
