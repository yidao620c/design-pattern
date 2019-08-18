package com.xncoding.pattern.strategy.payment;

/**
 * 通过策略的构造方法来传入新算法需要的数据。这样实现的话，
 * 就不需要扩展上下文了，直接添加新的策略算法实现就可以了
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */

/**
 * 支付到银行卡
 */
public class Card2 implements PaymentStrategy {
    /**
     * 账号信息
     */
    private String account = "";

    /**
     * 构造方法，传入账号信息
     *
     * @param account 账号信息
     */
    public Card2(String account) {
        this.account = account;
    }

    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "的"
                + this.account + "账号支付了" + ctx.getMoney() + "元");
        //连接银行，进行转账，就不去管了
    }
}
