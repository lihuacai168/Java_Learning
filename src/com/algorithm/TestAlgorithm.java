package com.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestAlgorithm {
    public static void main(String[] args) {
        int[] testArray = {5,4,1,3,3,2};
        System.out.println(Arrays.toString(Sort.bubbleSort(testArray)));
//        System.out.println(Arrays.toString(QuickSort.quickSort(testArray,0,testArray.length-1)));
}
}
