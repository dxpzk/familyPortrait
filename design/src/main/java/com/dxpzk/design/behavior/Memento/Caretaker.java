package com.dxpzk.design.behavior.Memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Caretaker {
    private Map<String, Memento> memMap = new HashMap<String, Memento>();
    public Memento getMemento(String index){
        return memMap.get(index);
    }

    public void setMemento(String index, Memento memento){
        this.memMap.put(index, memento);
    }
}
