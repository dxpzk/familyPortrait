package com.dxpzk.design.create.FactoryMethod;

/**
 * @author zk
 * @since 2020-08-21
 * 静态工厂方法模式
 */
public class Factory3 {
    public static Product createProduct1() {
        return new Product1();
    }

    public static Product createProduct2() {
        return new Product2();
    }
}
