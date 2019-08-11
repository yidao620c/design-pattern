package com.xncoding.pattern.singleton;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class Client {
    public static void main(String[] args) {
        //创建读取应用配置的对象
        AppConfig config = AppConfig.getInstance();
        String paramA = config.getParameterA();
        String paramB = config.getParameterB();
        System.out.println("paramA="+paramA+",paramB="+paramB);
    }
}
