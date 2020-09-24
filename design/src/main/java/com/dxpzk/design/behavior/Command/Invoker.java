package com.dxpzk.design.behavior.Command;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doSomething(){
        command.execute();
    }
}

class test{
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.doSomething();
    }
}
