package com.dxpzk.design.structure.Adapter.ObjectAdapter;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }


    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {

    }
}
