package com.dxpzk.design.create.AbstractFactory;

/**
 * @author zk
 * @since 2020-08-21
 */
public class Object2Factory extends Factory{
    @Override
    public Product_A createA() {
        return new Product_A2();
    }

    @Override
    public Product_B createB() {
        return new Product_B2();
    }
}
