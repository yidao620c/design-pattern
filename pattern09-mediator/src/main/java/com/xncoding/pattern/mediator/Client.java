package com.xncoding.pattern.mediator;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class Client {
    public static void main(String[] args) {
        //1：创建中介者——主板对象
        MainBoardImpl mainBoard = new MainBoardImpl();
        //2：创建同事类
        CDDriver cd = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VideoCard vc = new VideoCard(mainBoard);
        SoundCard sc = new SoundCard(mainBoard);
        //3：让中介者知道所有的同事
        mainBoard.setCdDriver(cd);
        mainBoard.setCpu(cpu);
        mainBoard.setVideoCard(vc);
        mainBoard.setSoundCard(sc);
        //4：开始看电影，把光盘放入光驱，光驱开始读盘
        cd.readCD();
    }
}
