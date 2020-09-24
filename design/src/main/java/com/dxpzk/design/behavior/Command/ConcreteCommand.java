package com.dxpzk.design.behavior.Command;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
