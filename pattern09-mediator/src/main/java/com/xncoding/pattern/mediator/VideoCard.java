package com.xncoding.pattern.mediator;

/**
 * VideoCard
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class VideoCard extends Device {

    public VideoCard(MainBoard mainBoard) {
        super(mainBoard);
    }

    /**
     * 显示视频数据
     *
     * @param data 被显示的数据
     */
    public void showData(String data) {
        System.out.println("您正观看的是：" + data);
    }
}
