package com.dxpzk.design.behavior.Visitor;

/**
 * @author zk
 * @since 2020-08-24
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
