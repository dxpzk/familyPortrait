package com.dxpzk.design.structure.Proxy.JDKProxy;

import com.dxpzk.design.structure.Proxy.RealSubject;
import com.dxpzk.design.structure.Proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zk
 * @since 2020-08-24
 */
public class JDKProxy {
    private Object target;
    public JDKProxy(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //开始代理
                        //......dosomething
                        Object obj = method.invoke(target,args);
                        return obj;
                    }
                });
    }

    public static void main(String[] args) {
        JDKProxy proxy = new JDKProxy(new RealSubject());
        Subject sub = (Subject)proxy.getProxyInstance();
        sub.method();
    }
}


