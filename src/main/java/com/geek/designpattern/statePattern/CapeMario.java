package com.geek.designpattern.statePattern;

/**
 * 具体的状态类，设计为单例模式
 * @author: carl
 * @date: 2025.02.20
 */

public class CapeMario implements IMario{
    private static final CapeMario instance=new CapeMario();

    public CapeMario() {
    }

    public static CapeMario getInstance(){
        return instance;
    }

    @Override
    public void obtainMushroom(MarioStateMachine marioStateMachine) {
        // do nothing
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        //do nothing
    }

    @Override
    public void obtainFire(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()+200);
        marioStateMachine.setCurrentState(FiredMario.getInstance());
    }

    @Override
    public void meetMaster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()-100);
        marioStateMachine.setCurrentState(SmallMario.getInstance());
    }

    @Override
    public String getName() {
        return State.CAPE.getName();
    }
}
