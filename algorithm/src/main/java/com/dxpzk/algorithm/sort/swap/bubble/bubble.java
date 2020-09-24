package com.dxpzk.algorithm.sort.swap.bubble;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author zk
 * @since 2020-08-25
 */
public class bubble {
    public static void main(String[] args) {
        int[] data = {9,8,7,6,5,4,3,2,1};
        swap(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static int[] swap(int[] data){
        for(int i =0; i < data.length-1; i++){
            for(int j = 0; j < data.length-1-i; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
}
