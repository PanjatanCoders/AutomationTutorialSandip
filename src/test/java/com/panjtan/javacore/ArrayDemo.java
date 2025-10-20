package com.panjtan.javacore;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr1;
        int []arr2;
        int arr3[];

        int arr[] = new int[10];
        String[] arrStr = new String[5];
        boolean[] arrBl = new boolean[5];

//        Create an array with available data
        String []fruits = {"Apple", "Banana", "Guava", "Date"};

        System.out.println(arr[0]);
//        for (int i : arr)
//            System.out.println(i);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrBl));

        System.out.println(Arrays.toString(fruits));

//        array Manipulation
        System.out.println(fruits[0]);
        fruits[0] = "Cherry";
        System.out.println(Arrays.toString(fruits));
        fruits[4] = "Nut";
        System.out.println(Arrays.toString(fruits));
    }
}
