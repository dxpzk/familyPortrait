package com.dxpzk.design.behavior.Iterator;

import java.util.List;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteIterator implements Iterator{
    private List<Object> list;
    private int index = 0;
    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return list.get(index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return list.size()>index;
    }
}
