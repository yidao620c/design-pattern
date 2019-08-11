package com.xncoding.pattern.mediator;


/**
 * 公共设备类
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public abstract class Device {
    private MainBoard mainBoard;

    public Device(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }
}