package com.dxpzk.design.behavior.Observer;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.response();
        }
    }
}
