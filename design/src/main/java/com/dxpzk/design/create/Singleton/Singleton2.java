package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 饿汉式（静态代码块）
 * 在类装载式装载，初始化实例，可能加载了但是使用没用到，造成内存的浪费
 */
public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2(){}

    private static Singleton2 getInstance(){
        return instance;
    }
}
