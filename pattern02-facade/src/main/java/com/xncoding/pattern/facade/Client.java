package com.xncoding.pattern.facade;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/10
 */
public class Client {
    public static void main(String[] args) {
        //使用Facade
        new Facade().generate();
    }
}
