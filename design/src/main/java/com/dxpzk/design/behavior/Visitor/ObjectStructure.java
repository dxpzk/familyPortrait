package com.dxpzk.design.behavior.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ObjectStructure {
    private List<Element> list=new ArrayList<Element>();
    public void accept(Visitor visitor)
    {
        Iterator<Element> i=list.iterator();
        while(i.hasNext())
        {
            ((Element) i.next()).accept(visitor);
        }
    }
    public void add(Element element)
    {
        list.add(element);
    }
    public void remove(Element element)
    {
        list.remove(element);
    }
}
