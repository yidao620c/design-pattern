package com.xncoding.pattern.singleton;

/**
 * 综合懒汉式和饿汉式。既能够实现懒加载，又是天然线程安全
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class Singleton {
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM 来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }

    /**
     * 私有化构造方法
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
