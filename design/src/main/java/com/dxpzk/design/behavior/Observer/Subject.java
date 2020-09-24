package com.dxpzk.design.behavior.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zk
 * @since 2020-08-24
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer)
    {
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
