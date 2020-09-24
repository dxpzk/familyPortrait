package com.dxpzk.algorithm.sort.insertion.shell;

import com.alibaba.fastjson.JSON;

/**
 * @author zk
 * @since 2020-08-25
 */
public class shell {
    public static void main(String[] args) {
        int data[] = {20,30,90,40,70,110,60,10,100,50,80};
        sort(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static void sort(int[] data){
        int d = data.length/2;

        while(d >= 1){
            shellInsert(data, d);
            d = d/2;
        }
    }

    public static void shellInsert(int[] data, int d){
        for(int i = d; i<data.length; i++){
            int j = i;
            int temp = data[i];
            while(j-d >=0 && data[j - d] > temp){
                data[j] = data[j-d];
                j = j-d;
            }
            data[j] = temp;
        }
    }
}
