package com.geek.designpattern.statePattern;

/**
 * 客户端
 * @author: carl
 * @date: 2025.02.20
 */

public class Solution {
    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        marioStateMachine.obtainMushroom();
        System.out.println(marioStateMachine.getCurrentState() + " score=" + marioStateMachine.getScore());
        marioStateMachine.obtainFire();
        System.out.println(marioStateMachine.getCurrentState() + " score=" + marioStateMachine.getScore());
        marioStateMachine.obtainCape();
        System.out.println(marioStateMachine.getCurrentState() + " score=" + marioStateMachine.getScore());
        marioStateMachine.meetMaster();
        System.out.println(marioStateMachine.getCurrentState() + " score=" + marioStateMachine.getScore());
    }
}
