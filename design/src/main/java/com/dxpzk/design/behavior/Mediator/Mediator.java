package com.dxpzk.design.behavior.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zk
 * @since 2020-08-24
 */
public abstract class Mediator {
    protected List<Colleague> colleagues = new ArrayList<Colleague>();

    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
