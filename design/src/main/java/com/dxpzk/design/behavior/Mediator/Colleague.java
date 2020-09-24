package com.dxpzk.design.behavior.Mediator;

/**
 * @author zk
 * @since 2020-08-24
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}
