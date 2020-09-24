package com.dxpzk.algorithm.sort.count;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author zk
 * @since 2020-08-25
 */
public class counting {
    public static void main(String[] args) {
        int data[] = {20,30,90,40,70,110,60,10,100,50,80};
        sort(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static void sort(int[] data) {
        if(data == null || data.length == 0)
            return ;

        int max = max(data);

        int[] count = new int[max+1];
        Arrays.fill(count, 0);

        for(int i=0; i<data.length; i++) {
            count[data[i]] ++;
        }

        int k = 0;
        for(int i=0; i<=max; i++) {
            for(int j=0; j<count[i]; j++) {
                data[k++] = i;
            }
        }

    }

    public static int max(int[] data) {
        int max = Integer.MIN_VALUE;
        for(int ele : data) {
            if(ele > max)
            max = ele;
        }
        return max;
    }
}
