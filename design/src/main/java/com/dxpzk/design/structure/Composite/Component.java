package com.dxpzk.design.structure.Composite;

/**
 * @author zk
 * @since 2020-08-24
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
