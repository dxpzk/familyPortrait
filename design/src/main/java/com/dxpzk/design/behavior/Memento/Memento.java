package com.dxpzk.design.behavior.Memento;

import java.util.Map;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Memento {
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> map){
        this.stateMap = map;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
