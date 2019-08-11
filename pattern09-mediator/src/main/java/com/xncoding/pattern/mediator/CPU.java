package com.xncoding.pattern.mediator;

/**
 * CPU
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class CPU extends Device {
    /**
     * 分解出来的视频数据
     */
    private String videoData = "";
    /**
     * 分解出来的声音数据
     */
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public CPU(MainBoard mainBoard) {
        super(mainBoard);
    }

    /**
     * 处理数据，把数据分成音频和视频的数据
     *
     * @param data 被处理的数据
     */
    public void executeData(String data) {
        //把数据分解开，前面的是视频数据，后面的是音频数据
        String[] ss = data.split(",");
        this.videoData = ss[0];
        this.soundData = ss[1];
        //通知主板，CPU 的工作完成
        this.getMainBoard().changed(this);
    }
}
