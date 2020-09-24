package com.dxpzk.design.structure.Adapter.ClassAdapter;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int request() {
        int v = method();

        return v/44;
    }
}
