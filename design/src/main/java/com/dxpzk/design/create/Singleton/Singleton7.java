package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 静态内部类
 */
public class Singleton7 {
    private Singleton7(){}

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
