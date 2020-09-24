package com.dxpzk.design.behavior.Mediator;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteMediator extends Mediator {
//    ConcreteMediator(){
//        super();
//    }

    @Override
    public void register(Colleague colleague) {
        colleague.setMediator(this);
        colleagues.add(colleague);
    }

    @Override
    public void relay(Colleague colleague) {
        for(Colleague ob:colleagues)
        {
            if(!ob.equals(colleague))
            {
                ((Colleague)ob).receive();
            }
        }
    }
}
