package com.panjtan.javacore;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Programming");
        StringBuffer sb1 = new StringBuffer("S");

        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb1.capacity());

        sb.append(" Class");
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.insert(3, " Online");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.capacity());
    }
}
