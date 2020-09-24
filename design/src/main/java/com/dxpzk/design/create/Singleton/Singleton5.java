package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 懒汉式（线程不安全，同步代码块）
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if(null == instance){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
