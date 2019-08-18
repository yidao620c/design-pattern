package com.xncoding.com.pattern.state.vote;

/**
 * NormalVoteState
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class NormalVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票
        //记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }
}
