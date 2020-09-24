package com.dxpzk.design.behavior.Visitor;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA()
    {
        return "具体元素A的操作。";
    }
}
