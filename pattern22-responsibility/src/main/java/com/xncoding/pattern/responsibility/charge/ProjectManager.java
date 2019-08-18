package com.xncoding.pattern.responsibility.charge;

/**
 * 项目经理处理者
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class ProjectManager extends Handler {
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //项目经理的权限比较小，只能在500 以内
        if (fee < 500) {
            //为了测试，简单点，只同意小李的
            if ("小李".equals(user)) {
                str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                //其他人一律不同意
                str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
