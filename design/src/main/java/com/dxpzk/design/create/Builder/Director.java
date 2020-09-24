package com.dxpzk.design.create.Builder;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Product create(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getProduct();
    }
}
