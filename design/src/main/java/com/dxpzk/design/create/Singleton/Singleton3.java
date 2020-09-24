package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 懒汉式（线程不安全）
 * 多线程下线程不安全
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(null == instance){
            instance = new Singleton3();
        }
        return instance;
    }
}
