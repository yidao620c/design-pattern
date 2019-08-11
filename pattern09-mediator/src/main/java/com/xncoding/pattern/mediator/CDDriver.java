package com.xncoding.pattern.mediator;

/**
 * CDDriver
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class CDDriver extends Device {
    /**
     * 自身业务数据
     */
    private String data = "";

    /**
     * 获取光驱读取出来的数据
     *
     * @return 光驱读取出来的数据
     */
    public String getData() {
        return this.data;
    }

    public CDDriver(MainBoard mainBoard) {
        super(mainBoard);
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        //逗号前是视频显示的数据，逗号后是声音
        this.data = "设计模式, 值得好好研究";
        //通知主板，自己的状态发生了改变
        this.getMainBoard().changed(this);
    }
}
