package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 枚举
 */
public enum Singleton8 {
    INSTANCE;

    public void doSomething(){}

    public static void main(String[] args) {
        Singleton8.INSTANCE.doSomething();
    }
}
