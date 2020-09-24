package com.dxpzk.design.behavior.Mediator;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        //..............
    }

    @Override
    public void send() {
        mediator.relay(this);
    }
}
