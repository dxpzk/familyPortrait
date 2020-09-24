package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-21
 * 双重检查
 */
public class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if(null == instance){
            synchronized (Singleton6.class){
                if(null == instance){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
