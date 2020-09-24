package com.dxpzk.design.behavior.Visitor;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB()
    {
        return "具体元素B的操作。";
    }
}
