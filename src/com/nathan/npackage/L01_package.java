package com.nathan.npackage;
import java.util.Arrays;

/**
 * @author nathan
 * @create 2021-09-16-18:45
 **/
public class L01_package {

    public static void main(String[] args) {
        int[] arr = {-1,20,2,13,3};
        // 使用系统提供的类的方法完成数组的排序。
        Arrays.sort(arr);

        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
    }



}
