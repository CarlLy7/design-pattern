package com.geek.designpattern.statePattern;

/**
 * small状态的具体状态实现类，实现行为接口
 * 具体的状态类设计为单例模式
 * @author: carl
 * @date: 2025.02.20
 */

public class SmallMario implements IMario {
    private static final SmallMario instance = new SmallMario();

    public SmallMario() {
    }

    public static SmallMario getInstance() {
        return instance;
    }

    @Override
    public void obtainMushroom(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()+100);
        marioStateMachine.setCurrentState(SuperMario.getInstance());
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()+300);
        marioStateMachine.setCurrentState(CapeMario.getInstance());
    }

    @Override
    public void obtainFire(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()+200);
        marioStateMachine.setCurrentState(FiredMario.getInstance());
    }

    @Override
    public void meetMaster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()-100);
    }

    @Override
    public String getName() {
        return State.SMALL.getName();
    }
}
