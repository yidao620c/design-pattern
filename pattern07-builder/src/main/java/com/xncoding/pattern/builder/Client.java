package com.xncoding.pattern.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class Client {
    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");
        Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        Collection<ExportDataModel> col = new ArrayList<>();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001 号");
        edm1.setPrice(100);
        edm1.setAmount(80);
        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002 号");
        edm2.setPrice(99);
        edm2.setAmount(55);
        //把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);
        //测试输出到文本文件
        TxtBuilder txtBuilder = new TxtBuilder();
        //创建指导者对象
        Director director = new Director(txtBuilder);
        director.construct(ehm, mapData);
        //把要输出的内容输出到控制台看看
        System.out.println("输出到文本文件的内容：\n" + txtBuilder.build());
    }
}
