package com.panjtan.javacore;

import java.util.Arrays;

public class StringClassDemo3 {
    public static void main(String[] args) {
        String s = "Java Selenium";
        String s1 = "Java Selenium";
        String s2 = "Java selenium";

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println("-".repeat(30));

        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.concat(" Learning"));
        System.out.println("-".repeat(30));

        s = s + "";

        System.out.println("");

        greet("Alice", "Mumbai");
        System.out.println("-".repeat(30));

        System.out.println(s.charAt(3));
        System.out.println(s);
        System.out.println("Contains: " + s.contains("nium"));
        System.out.println("Starts With: " + s.startsWith("Java"));
        System.out.println("End With: " + s.endsWith("nium"));

        System.out.println("-".repeat(30));

        System.out.println(s.indexOf("S"));
        System.out.println(s.indexOf("eni"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));

        System.out.println("-".repeat(30));
        System.out.println(s.length());

        String[] array = {"Apple", "Banana"};
        System.out.println(array.length);

        System.out.println("-".repeat(30));

        System.out.println(s.replace("Java", "Python"));

        System.out.println(s.replace("a", "e"));
        System.out.println(s.replaceAll("a", "e"));
        System.out.println(s.replaceFirst("a", "e"));
        System.out.println("-".repeat(30));

        s = s.concat(" Tutorial");
        System.out.println(s);
        String[] arr1 = s.split(" ");

        System.out.println(Arrays.toString(arr1));
        String s4 = "    hello, Alice. Welcome to Pune  ";

        String[] arr2 = s4.split(" ", 2);
        System.out.println(Arrays.toString(arr2));

        System.out.println(s4.strip());
        System.out.println(s4.trim());

        System.out.println(s4.strip());

        String text = "Hello, Alice. Welcome to Pune";
        System.out.println(text.substring(3));
        System.out.println(text.substring(3, 9));

        int index = text.indexOf("Welcome");
        System.out.println(text.substring(index));
    }
    static void greet(String name, String city) {
        String text = "Hello, " + name + ", Welcome to " + city+ ".";
        String formatted = "hello, %s. Welcome to %s.".formatted(name, city);
        System.out.println(text);
        System.out.println(formatted);
    }}
// hello, Alice. Welcome to Pune



