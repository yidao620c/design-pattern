package com.xncoding.pattern.prototype;

/**
 * 企业订单对象
 */
public class EnterpriseOrder implements Cloneable, OrderApi {
    private String enterpriseName;
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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String toString() {
        return "本企业订单的订购企业是=" + this.enterpriseName
                + "，订购产品是=" + this.productId + "，订购数量为="
                + this.orderProductNum;
    }

    public EnterpriseOrder clone() {
        EnterpriseOrder obj = null;
        try {
            obj = (EnterpriseOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}