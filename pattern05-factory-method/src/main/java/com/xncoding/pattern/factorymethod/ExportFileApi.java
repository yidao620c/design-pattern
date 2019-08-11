package com.xncoding.pattern.factorymethod;

/**
 * 导出文件对象的接口
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public interface ExportFileApi {
    /**
     * 导出内容成为文件
     *
     * @param data 需要保存的数据
     * @return 是否导出成功
     */
    public boolean export(String data);
}
