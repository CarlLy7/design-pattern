package com.geek.designpattern.statePattern;

/**
 * 具体的状态类，设计为单例模式,状态变更和得分变更通过接口将状态机作为参数传递过来
 * @author: carl
 * @date: 2025.02.20
 */

public class SuperMario implements IMario{
    private static final SuperMario instance=new SuperMario();

    public SuperMario() {
    }

    public static SuperMario getInstance(){
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
        return State.SUPER.getName();
    }
}
