package com.dxpzk.design.structure.Bridge;

/**
 * @author zk
 * @since 2020-08-24
 */
public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementor impl){
        super(impl);
    }

    @Override
    public void operation() {
        impl.method();
    }
}
