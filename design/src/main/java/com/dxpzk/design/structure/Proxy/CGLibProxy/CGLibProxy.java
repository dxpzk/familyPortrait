package com.dxpzk.design.structure.Proxy.CGLibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zk
 * @since 2020-08-24
 */
public class CGLibProxy implements MethodInterceptor {
    private RealSubject realSubject;
    public CGLibProxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    public Object getProxyIntance(){
        Enhancer ch = new Enhancer();
        ch.setSuperclass(realSubject.getClass());
        ch.setCallback(this);
        return ch.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //.......dosomething
        Object obj = method.invoke(realSubject, objects);
        //.......dosomething

        return obj;
    }

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        CGLibProxy proxy = new CGLibProxy(realSubject);

        ((RealSubject)proxy.getProxyIntance()).method();
    }
}
