package com.dxpzk.design.structure.Decorator;

/**
 * @author zk
 * @since 2020-08-21
 * 抽象装饰（Decorator）角色
 */
public abstract class Decorator implements Human{
    private Human human;

    public Decorator(Human human){
        this.human = human;
    }

    public void doSoimething(){
        human.doSoimething();
    }
}
