package com.dxpzk.design.create.FactoryMethod;

/**
 * @author zk
 * @since 2020-08-21
 * 工厂方法模式
 */
public class Factory2_1 implements Factory2{
    @Override
    public Product createProduct() {
        return new Product1();
    }
}
