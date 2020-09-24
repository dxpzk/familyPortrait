package com.dxpzk.design.behavior.Memento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zk
 * @since 2020-08-24
 */
public class Originator {
    private String state1 = "";
    private String state2 = "";
    private String state3 = "";

    public String getState1() {
        return state1;
    }
    public void setState1(String state1) {
        this.state1 = state1;
    }
    public String getState2() {
        return state2;
    }
    public void setState2(String state2) {
        this.state2 = state2;
    }
    public String getState3() {
        return state3;
    }
    public void setState3(String state3) {
        this.state3 = state3;
    }
    public Memento createMemento(){
        return new Memento(BeanUtils.backupProp(this));
    }

    public void restoreMemento(Memento memento){
        BeanUtils.restoreProp(this, memento.getStateMap());
    }
    public String toString(){
        return "state1="+state1+"state2="+state2+"state3="+state3;
    }
}

class BeanUtils {
    public static Map<String, Object> backupProp(Object bean){
        Map<String, Object> result = new HashMap<String, Object>();
        try{
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for(PropertyDescriptor des: descriptors){
                String fieldName = des.getName();
                Method getter = des.getReadMethod();
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if(!fieldName.equalsIgnoreCase("class")){
                    result.put(fieldName, fieldValue);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProp(Object bean, Map<String, Object> propMap){
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for(PropertyDescriptor des: descriptors){
                String fieldName = des.getName();
                if(propMap.containsKey(fieldName)){
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
