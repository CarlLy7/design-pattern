package com.geek.designpattern.statePattern;

/**
 * 状态机
 * 状态机和行为接口双向依赖
 * @author: carl
 * @date: 2025.02.20
 */

public class MarioStateMachine {
    private int score;
    //不使用状态枚举来表示状态，而是使用行为接口来表示
    private IMario currentState;

    public MarioStateMachine() {
        this.score=0;
        this.currentState=SmallMario.getInstance();
    }

    public void obtainMushroom(){
        currentState.obtainMushroom(this);
    }
    public void obtainCape(){
        currentState.obtainCape(this);
    }
    public void obtainFire(){
        currentState.obtainFire(this);
    }
    public void meetMaster(){
        currentState.meetMaster(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

    public String getCurrentState() {
        return currentState.getName();
    }
}
