package com.dxpzk.design.behavior.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();
    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
