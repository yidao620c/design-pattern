package com.xncoding.pattern.singleton;

/**
 * 使用枚举来实现单例模式的示例（最佳方法）
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public enum Singleton2 {
    /**
     * 定义一个枚举的元素，它就代表了Singleton 的一个实例
     */
    uniqueInstance;
    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }
}
