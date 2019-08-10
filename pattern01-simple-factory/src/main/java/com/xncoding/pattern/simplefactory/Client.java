package com.xncoding.pattern.simplefactory;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/10
 */
public class Client {
    public static void main(String[] args) {
        //通过简单工厂来获取接口对象
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
