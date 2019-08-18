package com.xncoding.pattern.memento.calculator;

/**
 * 减法命令
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class SubstractCommand extends AbstractCommand{
    private int opeNum;
    public SubstractCommand(int opeNum){
        this.opeNum = opeNum;
    }
    public void execute() {
        this.operation.substract(opeNum);
    }
}
