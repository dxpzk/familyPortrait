package com.dxpzk.algorithm.sort.select.selection;

import com.alibaba.fastjson.JSON;

/**
 * @author zk
 * @since 2020-08-25
 */
public class selection {
    public static void main(String[] args) {
        int[] data = {3,1,2,5,4,6,9,7,10,8};
        sort(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static void sort(int[] data){
        int temp;
        for(int i = 0; i < data.length; i++){
            int min = i;
            for(int j = i+1; j < data.length; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}
