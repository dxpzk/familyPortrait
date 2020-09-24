package com.dxpzk.design.structure.Flyweight;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;
    public ConcreteFlyweight(String key){
        this.key = key;
    }
    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        //............
    }
}
