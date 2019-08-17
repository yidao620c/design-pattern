package com.xncoding.pattern.command.computer;

/**
 * 命令接口，声明执行的操作
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/14
 */
public interface Command {
    /**
     * 执行命令对应的操作
     */
    public void execute();
}
