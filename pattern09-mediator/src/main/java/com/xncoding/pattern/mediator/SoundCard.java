package com.xncoding.pattern.mediator;

/**
 * SoundCard
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class SoundCard extends Device {
    public SoundCard(MainBoard mainBoard) {
        super(mainBoard);
    }

    /**
     * 按照声频数据发出声音
     *
     * @param data 发出声音的数据
     */
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
