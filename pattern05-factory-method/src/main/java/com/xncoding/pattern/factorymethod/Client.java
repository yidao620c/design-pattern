package com.xncoding.pattern.factorymethod;

public class Client {
    public static void main(String[] args) {
        //创建需要使用的Creator 对象
        ExportOperate operate = new ExportDBOperate();
        //调用输出数据的功能方法
        operate.export("测试数据");
    }
}