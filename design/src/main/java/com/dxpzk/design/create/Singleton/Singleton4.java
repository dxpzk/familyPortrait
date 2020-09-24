package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 懒汉式（线程安全，同步方法）
 * 造成严重阻塞
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){}

    public static synchronized Singleton4 getInstance(){
        if(null == instance){
            instance = new Singleton4();
        }
        return instance;
    }
}
