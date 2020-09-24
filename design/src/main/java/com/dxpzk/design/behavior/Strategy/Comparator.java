package com.dxpzk.design.behavior.Strategy;

/**
 * @author zk
 * @since 2020-08-21
 *
 * Strategy 抽象策略角色
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
