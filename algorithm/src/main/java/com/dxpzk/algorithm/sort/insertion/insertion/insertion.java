package com.dxpzk.algorithm.sort.insertion.insertion;

import com.alibaba.fastjson.JSON;

/**
 * @author zk
 * @since 2020-08-25
 */
public class insertion {
    public static void main(String[] args) {
        int[] data = {9,8,7,6,5,4,3,2,1};
        sort(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static void sort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int j = i;
            int target = data[i];
            while(j>0 && data[j-1] >= target){
                data[j] = data[j-1];
                j--;
            }
            data[j] = target;
        }
    }
}
