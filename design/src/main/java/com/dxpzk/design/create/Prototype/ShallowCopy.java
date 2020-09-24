package com.dxpzk.design.create.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zk
 * @since 2020-08-24
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        DataObj dataObj = new DataObj();

        DataObj shallowCopy = (DataObj)dataObj.clone();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(out);
        oo.writeObject(shallowCopy);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(in);

        DataObj deepCopy1 =(DataObj)ois.readObject();



    }
}
