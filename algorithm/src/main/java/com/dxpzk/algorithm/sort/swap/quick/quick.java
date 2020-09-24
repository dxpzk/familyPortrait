package com.dxpzk.algorithm.sort.swap.quick;

import com.alibaba.fastjson.JSON;

/**
 * @author zk
 * @since 2020-08-25
 */
public class quick {
    public static void main(String[] args) {
        int[] data = {3,1,2,5,4,6,9,7,10,8};
        quickSort(data, 0, data.length-1);
        System.out.println(JSON.toJSONString(data));
    }

    public static void quickSort(int[] data, int left, int right){
        int i,j,temp,t;
        if(left > right){
            return;
        }

        i = left;
        j = right;
        temp = data[left];

        while(i < j){
            while(temp <= data[j] && j>i){
                j--;
            }

            while(temp>=data[i] && i<j){
                i++;
            }

            if(i<j){
                t=data[i];
                data[i] = data[j];
                data[j] = t;
            }
        }

        data[left] = data[i];
        data[i] = temp;

        quickSort(data, left, i-1);
        quickSort(data, i+1, right);
    }
}
