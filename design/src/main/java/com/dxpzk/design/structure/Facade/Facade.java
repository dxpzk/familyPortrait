package com.dxpzk.design.structure.Facade;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Facade {
    private SubSystem1 sub1 = new SubSystem1();
    private SubSystem2 sub2 = new SubSystem2();

    public void methodA(){
        sub1.method1a();
        sub2.method2a();
    }

    public void methodB(){
        sub1.method1a();
        sub2.method2a();
    }
}
