package com.dxpzk.design.behavior.Responsibility;

/**
 * @author zk
 * @since 2020-08-21
 * 客户类（Client）角色
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConHandler1();
        Handler handler2 = new ConHandler2();
        Handler handler3 = new ConHandler3();

        handler2.setNext(handler3);
        handler1.setNext(handler2);

        handler1.handleRequest("three");

    }
}
