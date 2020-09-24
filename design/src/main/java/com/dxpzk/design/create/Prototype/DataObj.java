package com.dxpzk.design.create.Prototype;

import java.io.Serializable;

/**
 * @author zk
 * @since 2020-08-24
 */
public class DataObj implements Cloneable, Serializable {
    public int id;
    public String name;
    public int age;
    public String mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "DataObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark='" + mark + '\'' +
                '}';
    }

    public Object clone() throws CloneNotSupportedException{
        return (DataObj)super.clone();
    }
}
