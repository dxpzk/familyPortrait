package com.dxpzk.algorithm.sort.merge;

import com.alibaba.fastjson.JSON;

/**
 * @author zk
 * @since 2020-08-25
 */
public class merge {
    public static void main(String[] args) {
        int data[] = {20,30,90,40,70,110,60,10,100,50,80};
        mSort(data, 0, data.length-1);
        System.out.println(JSON.toJSONString(data));
    }

    public static void mSort(int[] data, int left, int right){
        if(left >= right){
            return;
        }
        int mid = (left + right)/2;

        mSort(data, left, mid);
        mSort(data ,mid+1, right);

        //合并
        merge(data, left, mid, right);
    }

    public static void merge(int[] data, int left, int mid, int right){
        int[] temp = new int[right -left + 1];//中间数组

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){
            if(data[i] <= data[j]){
                temp[k++] = data[i++];
            }else{
                temp[k++] = data[j++];
            }
        }

        while(i <= mid){
            temp[k++] = data[i++];
        }

        while(j <= right){
            temp[k++] = data[j++];
        }

        for(int l = 0; l < temp.length; l++){
            data[l + left] = temp[l];
        }
    }
}
