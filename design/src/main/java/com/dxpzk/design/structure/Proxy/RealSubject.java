package com.dxpzk.design.structure.Proxy;

import com.dxpzk.design.structure.Proxy.Subject;

/**
 * @author zk
 * @since 2020-08-24
 */
public class RealSubject implements Subject {
    @Override
    public void method() {
        System.out.println("RealSubject");
    }
}
