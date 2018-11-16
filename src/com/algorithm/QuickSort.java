package com.algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] myArray, int begin, int last){
//        递归出口
        if (begin >= last){
            return ;
        }

        int low = begin;
        int high = last;
//        递归出口要在这之前,否则会出现数组越界
        int flag = myArray[begin];



        while (low<high){
            while (low<high && myArray[high]>=flag ){
                high--;
            }
            myArray[low] = myArray[high];

            while (low<high && myArray[low]<flag){
                low++;
            }
            myArray[high] = myArray[low];

        }
        myArray[low] = flag;

//        if(begin<low){quickSort(myArray,0,low-1);}
//        if(last>high){quickSort(myArray,low+1,last);}
        quickSort(myArray,0,low-1);
        quickSort(myArray,low+1,last);
    }

    public static void main(String[] args) {
        int[] testArray = {4,2,2,3,3};
        quickSort(testArray,0,testArray.length-1);
        System.out.println(Arrays.toString(testArray));
    }
}
