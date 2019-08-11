package com.xncoding.pattern.builder;

/**
 * ExportHeaderModel
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/11
 */
public class ExportHeaderModel {
    /**
     * 分公司或门市点编号
     */
    private String depId;
    /**
     * 导出数据的日期
     */
    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
