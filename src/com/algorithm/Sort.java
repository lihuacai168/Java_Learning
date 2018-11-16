package com.algorithm;

public class Sort {
    public static int[] bubbleSort(int[] myArray) {



        for (int i = 0; i < myArray.length-1; i++) {//控制外层循环的次数.每循环一次,排好一个元素的位置
            for (int j = 0; j < myArray.length-1-i; j++) {//遍历数组的所有元素;-i是因为第i次已经排好了i个元素.没必要再遍历

                if (myArray[j] > myArray[j+1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }

        }
        return myArray;
    }
}
