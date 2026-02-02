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
        char[] arrC = new char[5];
//        System.out.println(Arrays.toString(arrC));
//        System.out.println(arrC[0]);

//        Create an array with available data
        String []fruits = {"Apple", "Banana", "Guava", "Date"}; //length = 4

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }
//        System.out.println(arr[0]);
////        for (int i : arr)
////            System.out.println(i);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrStr));
//        System.out.println(Arrays.toString(arrBl));
//
//        System.out.println(Arrays.toString(fruits));
//
////        array Manipulation
//        System.out.println(fruits[0]);
//        fruits[0] = "Cherry";
//        System.out.println(Arrays.toString(fruits));
//        fruits[3] = "Nut";
//        System.out.println(Arrays.toString(fruits));

//
//        String[] newFruits = fruits.clone();
//        System.out.println(Arrays.toString(newFruits));
//        newFruits[0] = "PineApple";
//        System.out.println("New Fruit: " + Arrays.toString(newFruits));
//        System.out.printf("Original Fruit: " + Arrays.toString(fruits));
//
//        System.out.println("*".repeat(40));
//        String[] fruits1 = fruits;
//        fruits1[0] = "Cherry";
//        System.out.println("New Fruit: " + Arrays.toString(fruits1));
//        System.out.printf("Original Fruit: " + Arrays.toString(fruits));

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));


        int[] num2 = {1, 6, 7, 2, 3, 4, 10, 5, 8, 9};
//        Arrays.sort(num2);
//        System.out.println(Arrays.toString(num2));

        Arrays.sort(num2, 2, 8);
        System.out.println(Arrays.toString(num2));

    }
}
