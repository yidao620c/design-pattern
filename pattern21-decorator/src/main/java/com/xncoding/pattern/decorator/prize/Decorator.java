package com.xncoding.pattern.decorator.prize;

import java.util.Date;

/**
 * 装饰器的接口，需要和被装饰的对象实现同样的接口
 */
public abstract class Decorator extends Component {
    /**
     * 持有被装饰的组件对象
     */
    protected Component c;

    /**
     * 通过构造方法传入被装饰的对象
     *
     * @param c 被装饰的对象
     */
    public Decorator(Component c) {
        this.c = c;
    }

    public double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return c.calcPrize(user, begin, end);
    }
}