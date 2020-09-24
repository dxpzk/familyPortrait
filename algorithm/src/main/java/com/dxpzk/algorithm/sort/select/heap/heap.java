package com.dxpzk.algorithm.sort.select.heap;

import com.alibaba.fastjson.JSON;

/**
 * @author zk
 * @since 2020-08-25
 */
public class heap {
    public static void main(String[] args) {
        int data[] = {20,30,90,40,70,110,60,10,100,50,80};
        sort(data);
        System.out.println(JSON.toJSONString(data));
    }

    public static void sort(int[] data){
        //构造大堆根
        heapInsert(data);

        int size = data.length;

        while (size > 0) {
            //固定最大值
            swap(data, 0, size - 1);
            size--;
            //构造大根堆
            heapify(data, 0, size);
        }
    }

    //构造大堆根
    public static void heapInsert(int[] data){
        for (int i = 0; i < data.length; i++) {
            //当前插入的索引
            int currentIndex = i;
            //父结点索引
            int fatherIndex = (currentIndex - 1) / 2;
            //如果当前插入的值大于其父结点的值,则交换值，并且将索引指向父结点
            //然后继续和上面的父结点值比较，直到不大于父结点，则退出循环
            while (data[currentIndex] > data[fatherIndex]) {
                //交换当前结点与父结点的值
                swap(data, currentIndex, fatherIndex);
                //将当前索引指向父索引
                currentIndex = fatherIndex;
                //重新计算当前索引的父索引
                fatherIndex = (currentIndex - 1) / 2;

            }

        }
    }

    //将剩余的数构造成大根堆（通过顶端的数下降）
    public static void heapify(int[] arr, int index, int size) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        while (left < size) {
            int largestIndex;
            //判断孩子中较大的值的索引（要确保右孩子在size范围之内）
            if (arr[left] < arr[right] && right < size) {
                largestIndex = right;
            } else {
                largestIndex = left;
            }

            //比较父结点的值与孩子中较大的值，并确定最大值的索引
            if (arr[index] > arr[largestIndex]) {
                largestIndex = index;
            }

            //如果父结点索引是最大值的索引，那已经是大根堆了，则退出循环
            if (index == largestIndex) {
                break;
            }

            //父结点不是最大值，与孩子中较大的值交换
            swap(arr, largestIndex, index);
            //将索引指向孩子中较大的值的索引
            index = largestIndex;
            //重新计算交换之后的孩子的索引
            left = 2 * index + 1;
            right = 2 * index + 2;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
