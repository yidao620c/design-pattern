package com.xncoding.pattern.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取应用配置文件，单例实现（饿汉式）
 */
public class AppConfig {
    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
     */
    private static AppConfig instance = new AppConfig();

    /**
     * 定义一个方法来为客户端提供AppConfig 类的实例
     *
     * @return 一个AppConfig 的实例
     */
    public static AppConfig getInstance() {
        return instance;
    }

    /**
     * 用来存放配置文件中参数A 的值
     */
    private String parameterA;
    /**
     * 用来存放配置文件中参数B 的值
     */
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    /**
     * 私有化构造方法
     */
    private AppConfig() {
        //调用读取配置文件的方法
        readConfig();
    }

    /**
     * 读取配置文件，把配置文件中的内容读出来设置到属性上
     */
    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream(
                    "AppConfig.properties");
            p.load(in);
            //把配置文件中的内容读出来设置到属性上
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}