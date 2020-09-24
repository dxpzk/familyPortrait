package com.dxpzk.design.behavior.Responsibility;

/**
 * @author zk
 * @since 2020-08-21
 * 抽象处理者（Handler）角色
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
