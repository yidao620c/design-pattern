package com.xncoding.pattern.builder;

import java.util.Collection;
import java.util.Map;

/**
 * 指导者，指导使用生成器的接口来构建产品的对象
 */
public class Director {
    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入生成器对象
     *
     * @param builder 生成器对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导生成器构建最终的输出的文件的对象
     *
     * @param ehm     文件头的内容
     * @param mapData 数据的内容
     */
    public void construct(ExportHeaderModel ehm,
                          Map<String, Collection<ExportDataModel>> mapData) {
        //1：先构建Header
        builder.buildHeader(ehm);
        //2：然后构建Body
        builder.buildBody(mapData);
    }
}