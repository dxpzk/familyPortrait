package com.dxpzk.design.create.Builder;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteBuilder_1 extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("");
    }

    @Override
    public void buildPartB() {
        product.setPartB("");
    }

    @Override
    public void buildPartC() {
        product.setPartB("");
    }
}
