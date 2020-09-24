package com.dxpzk.design.behavior.Responsibility;

/**
 * @author zk
 * @since 2020-08-21
 * 具体处理者（Concrete Handler）角色
 */
public class ConHandler2 extends Handler{

    @Override
    public void handleRequest(String request) {
        if(request.equals("two")){
            System.out.println("two");
        }else if(null != getNext()){
            getNext().handleRequest(request);
        }else{

        }
    }
}
