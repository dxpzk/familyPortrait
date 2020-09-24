package com.dxpzk.design.behavior.Visitor;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        element.operationA();
    }

    @Override
    public void visit(ConcreteElementB element) {
        element.operationB();
    }
}
