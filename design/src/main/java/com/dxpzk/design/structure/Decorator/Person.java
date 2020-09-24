package com.dxpzk.design.structure.Decorator;

/**
 * @author zk
 * @since 2020-08-21
 * 具体构件（Concrete Component）角色
 */
public class Person implements Human{
    @Override
    public void doSoimething() {
        System.out.println("sleep");
    }
}
