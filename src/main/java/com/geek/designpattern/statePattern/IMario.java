package com.geek.designpattern.statePattern;

/**
 * 所有行为的一个抽象接口
 * @author: carl
 * @date: 2025.02.20
 */
public interface IMario {
    void obtainMushroom(MarioStateMachine marioStateMachine);
    void obtainCape(MarioStateMachine marioStateMachine);
    void obtainFire(MarioStateMachine marioStateMachine);
    void meetMaster(MarioStateMachine marioStateMachine);
    String getName();
}
