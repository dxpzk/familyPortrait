package com.dxpzk.design.behavior.State;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteStateB extends State{
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
