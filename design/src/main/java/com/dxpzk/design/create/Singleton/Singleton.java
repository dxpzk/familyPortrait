package com.dxpzk.design.create.Singleton;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}

class Singleton_1 {
    private static Singleton_1 instance;
    private Singleton_1(){}

    public static Singleton_1 getInstance(){
        return new Singleton_1();
    }
}

class Singleton_2 {
    private static Singleton_2 instance;
    private Singleton_2(){}

    public static synchronized Singleton_2 getInstance(){
        if(null == instance){
            instance = new Singleton_2();
        }
        return instance;
    }
}

class Singleton_3 {
    private static Singleton_3 instance;
    private Singleton_3(){}

    public static Singleton_3 getInstance(){
        if(null == instance){
            synchronized (Singleton_3.class){
                instance = new Singleton_3();
            }
        }
        return instance;
    }
}

class Singleton_4 {
    private static volatile Singleton_4 instance;
    private Singleton_4(){}

    public static Singleton_4 getInstance(){
        if(null == instance){
            synchronized (Singleton_3.class){
                if(null == instance){
                    instance = new Singleton_4();
                }
            }
        }
        return instance;
    }
}

class Singleton_5 {
    private static Singleton_5 instance;
    static{
        instance = new Singleton_5();
    }
    private Singleton_5(){}

    public static Singleton_5 getInstance(){
        return instance;
    }
}

class Singleton_6 {
    private static class XXX{
        private static final Singleton_6 INSTANCE = new Singleton_6();
    }
    private Singleton_6(){}

    public static Singleton_6 getInstance(){
        return XXX.INSTANCE;
    }
}

enum Singleton_7{
    INSTANCE;

    public void m(){}

    public static void main(String[] args) {
        Singleton_7.INSTANCE.m();
    }
}