package com.qfye.java.week1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName Example7
 * @Description TODO
 * @Author QIAN-feng
 * @Date 2020/10/8
 **/
public class Example7 {
    public static void main(String[] args) {
        int[] a ={12,34,9,45,6,45,90,123,19,34};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int number = 45;
        int index = Arrays.binarySearch(a,number);
        if(index>= 0){
            System.out.println(number +"和数组中索引为"+ index+"的元素值相同");
        }
        else{
            System.out.println(number +"不与数组中的任何元素值相同");
        }
    }
}
