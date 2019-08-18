package com.xncoding.com.pattern.state.vote;

/**
 * BlackVoteState
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class BlackVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //黑名单
        //记入黑名单中，禁止登录系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
