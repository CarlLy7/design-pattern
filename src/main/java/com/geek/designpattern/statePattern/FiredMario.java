package com.geek.designpattern.statePattern;

/**
 * 具体的状态实现类，设计为单例模式
 * @author: carl
 * @date: 2025.02.20
 */

public class FiredMario implements IMario{
    private static final FiredMario instance=new FiredMario();

    public FiredMario() {
    }
    public static FiredMario getInstance(){
        return instance;
    }

    @Override
    public void obtainMushroom(MarioStateMachine marioStateMachine) {
        //do nothing
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()+300);
        marioStateMachine.setCurrentState(CapeMario.getInstance());
    }

    @Override
    public void obtainFire(MarioStateMachine marioStateMachine) {
        //do nothing
    }

    @Override
    public void meetMaster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setScore(marioStateMachine.getScore()-100);
        marioStateMachine.setCurrentState(SmallMario.getInstance());
    }

    @Override
    public String getName() {
        return State.FIRED.getName();
    }
}
