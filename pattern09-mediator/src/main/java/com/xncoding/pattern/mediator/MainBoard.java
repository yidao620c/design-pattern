package com.xncoding.pattern.mediator;

/**
 * 主板类（充当中介者角色）
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public interface MainBoard {
    /**
     * 同事对象在自身改变的时候来通知中介者的方法，让中介者去负责相应的与其他同事对象的交互
     *
     * @param device 设备对象，好让中介者对象通过对象实例去获取同事对象的状态
     */
    void changed(Device device);
}
