package com.dxpzk.design.create.AbstractFactory;

/**
 * @author zk
 * @since 2020-08-21
 */
public class Object1Factory extends Factory{
    @Override
    public Product_A createA() {
        return new Product_A1();
    }

    @Override
    public Product_B createB() {
        return new Product_B1();
    }
}
