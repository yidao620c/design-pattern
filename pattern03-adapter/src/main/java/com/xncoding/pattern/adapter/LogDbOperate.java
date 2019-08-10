package com.xncoding.pattern.adapter;

import java.util.List;

/**
 * LogDbOperate
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/10
 */
public class LogDbOperate implements LogDbOperateApi {
    @Override
    public void createLog(LogModel lm) {
        System.out.println("LogDbOperate createLog");
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println("LogDbOperate updateLog");
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("LogDbOperate removeLog");
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("LogDbOperate getAllLog");
        return null;
    }
}
