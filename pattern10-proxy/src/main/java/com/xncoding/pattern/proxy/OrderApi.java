package com.xncoding.pattern.proxy;

/**
 * 订单对象的接口定义
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/12
 */
public interface OrderApi {
    /**
     * 获取订单订购的产品名称
     *
     * @return 订单订购的产品名称
     */
    public String getProductName();

    /**
     * 设置订单订购的产品名称
     *
     * @param productName 订单订购的产品名称
     * @param user        操作人员
     */
    public void setProductName(String productName, String user);

    /**
     * 获取订单订购的数量
     *
     * @return 订单订购的数量
     */
    public int getOrderNum();

    /**
     * 设置订单订购的数量
     *
     * @param orderNum 订单订购的数量
     * @param user     操作人员
     */
    public void setOrderNum(int orderNum, String user);

    /**
     * 获取创建订单的人员
     *
     * @return 创建订单的人员
     */
    public String getOrderUser();

    /**
     * 设置创建订单的人员
     *
     * @param orderUser 创建订单的人员
     * @param user      操作人员
     */
    public void setOrderUser(String orderUser, String user);
}
