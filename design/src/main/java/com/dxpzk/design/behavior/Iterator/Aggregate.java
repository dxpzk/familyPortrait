package com.dxpzk.design.behavior.Iterator;

/**
 * @author zk
 * @since 2020-08-24
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();
}
