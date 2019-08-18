package com.xncoding.com.pattern.state.vote;

/**
 * RepeatVoteState
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票
        //暂时不做处理
        System.out.println("请不要重复投票");
    }
}