package com.dxpzk.design.structure.Proxy.AbstractPrxoy;

import com.dxpzk.design.structure.Proxy.RealSubject;
import com.dxpzk.design.structure.Proxy.Subject;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    public Proxy(){
        realSubject = new RealSubject();
    }

    @Override
    public void method() {
        //......dosomething
        realSubject.method();
    }
}
