package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 饿汉模式(静态常量)
 * 未达到懒加载的目的，可能加载了但是使用没用到，造成内存的浪费
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}
