package com.dxpzk.design.behavior.Strategy;

/**
 * @author zk
 * @since 2020-08-21
 */
public class Context {
    private Comparator obj;

    public Context(Comparator obj){
        this.obj = obj;
    }

    public void method(){
        obj.compare(null,null);
    }
}
