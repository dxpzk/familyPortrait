package com.dxpzk.design.structure.Bridge;

/**
 * @author zk
 * @since 2020-08-24
 */
public abstract class Abstraction {
    protected Implementor impl;
    protected Abstraction(Implementor impl){
        this.impl = impl;
    }

    public abstract void operation();
}
