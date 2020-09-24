package com.dxpzk.design.create.FactoryMethod;

/**
 * @author zk
 * @since 2020-08-21
 * 简单工厂模式
 */
public class Factory1 {
    public Product createProduct1() {
        return new Product1();
    }

    public Product createProduct2() {
        return new Product2();
    }
}
