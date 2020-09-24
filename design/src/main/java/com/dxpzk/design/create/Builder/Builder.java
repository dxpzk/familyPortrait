package com.dxpzk.design.create.Builder;

/**
 * @author zk
 * @since 2020-08-24
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct(){
        return product;
    }
}
