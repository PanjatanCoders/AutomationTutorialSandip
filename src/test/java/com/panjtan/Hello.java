package com.panjtan;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        Normal for loop
//        for(int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

//        Enhanced for loop
//        Collection of data - array, list, map
        int[] nums = {12, 11, 28, 2, 20};
        for (int i = 0; i < nums.length; i++ ) {
            System.out.println(nums[i]);
        }
//        Advance/Enhanced for loop
//        {} -> is optional for single line statement inside if/else if/else/for/while block
//        {} -> is Mandatory for multi line statement inside if/else if/else/for/while block
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("=========================");

        for (int num : nums)
            System.out.println(num);

        System.out.println("=========================");
//        Modern
        Arrays.stream(nums).forEach(System.out::println);
    }
}
