package com.dxpzk.design.structure.Flyweight;

/**
 * @author zk
 * @since 2020-08-24
 */
public class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}
