package com.panjtan.javacore;

public class StringClass2 {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("S == s1: " + (s == s1));
        System.out.println("S == s3: " + (s == s3));
        System.out.println("S3 == s4: " + (s3 == s4));

        System.out.println("*".repeat(30));

        System.out.println("s equals s1: " + s.equals(s1));
        System.out.println("s equals s3: " + s.equals(s3));
        System.out.println("s4 equals s4: " + s4.equals(s4));

        System.out.println("*".repeat(30));

        s = s + "Coding";
        System.out.println(s);
        System.out.println("S == s1: " + (s == s1));

    }
}
