package com.dxpzk.design.behavior.State;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Context {
    private State state;

    public Context(){
        state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Handle(){
        state.Handle(this);
    }
}
