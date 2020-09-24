package com.dxpzk.algorithm.sort.base;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zk
 * @since 2020-08-25
 */
public class base {
    public static void main(String[] args) {
        int data[] = {20,30,90,40,70,110,60,10,100,50,80};
        sort(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static void sort(int[] data){
        int maxBit = getMaxBit(data);

        for(int i = 1; i <= maxBit; i++){
            List<List<Integer>> buf = distribute(data, i);
            collecte(data, buf); //收集
        }

    }

    //获取最大的位数
    public static int getMaxBit(int[] data){
        int max = 0;
        for(int i = 0; i < data.length; i++){
            if(max < (data[i]+"").length()){
                max = (data[i]+"").length();
            }
        }
        return max;
    }

    //获取第n位
    public static int getNBit(int x, int n){
        String sx = x + "";
        if(sx.length() < n){
            return 0;
        }else{
            return sx.charAt(sx.length()-n) - '0';
        }
    }

    public static List<List<Integer>> distribute(int[] data, int iBit){
        List<List<Integer>> buf = new ArrayList<List<Integer>>();
        for(int i = 0; i <10; i++){
            buf.add(new LinkedList<Integer>());
        }
        for(int j = 0; j < data.length; j++){
            buf.get(getNBit(data[j], iBit)).add(data[j]);
        }

        return buf;
    }

    public static void collecte(int[] data, List<List<Integer>> buf){
        int k = 0;
        for(List<Integer> bucket : buf){
            for(int ele : bucket){
                data[k++] = ele;
            }
        }
    }
}
