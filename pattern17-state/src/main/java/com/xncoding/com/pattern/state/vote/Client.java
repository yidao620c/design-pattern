package com.xncoding.com.pattern.state.vote;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 8; i++) {
            vm.vote("u1", "A");
        }
    }
}
