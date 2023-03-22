package com.ronbay.desigin.module.state.demo02;

/**
 * @Description: 状态模式实例-马里奥游戏
 * @Author
 * @Date 2023/3/22
 * @Version 1.0
 */
public class MarioStateMachine {
    private State currentState;
    private int score;

    public MarioStateMachine(State currentState, int score) {
        this.currentState = currentState;
        this.score = score;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getScore() {
        return score;
    }

    public void obtainMushRoom() {
        if (currentState.equals(State.SMALL)) { this.currentState = State.SUPER; this.score += 100; }
    }
    public void obtainCape() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER) ) { this.currentState = State.CAPE; this.score += 200; }
    }
    public void obtainFireFlower() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER) ) { this.currentState = State.FIRE; this.score += 300; }
    }
    public void meetMonster() {
        if (currentState.equals(State.SUPER)) { this.currentState = State.SMALL; this.score -= 100; return; } if (currentState.equals(State.CAPE)) { this.currentState = State.SMALL; this.score -= 200; return; } if (currentState.equals(State.FIRE)) { this.currentState = State.SMALL; this.score -= 300; return; }
    }
}
