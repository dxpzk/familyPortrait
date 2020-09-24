package com.dxpzk.design.behavior.TemplateMethod;

/**
 * @author zk
 * @since 2020-08-24
 */
public abstract class AbstractClass {
    public void TemplateMethod(){
        step1();
        step2();
        step3();
    }

    public void step1(){}

    public abstract void step2();
    public abstract void step3();
}
