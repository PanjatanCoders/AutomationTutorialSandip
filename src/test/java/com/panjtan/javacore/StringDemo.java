package com.panjtan.javacore;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Java Selenium" + "\nJava is based on OOPS" +
                "\nSelenium is mainly to interact with browser. ";

        System.out.println(s1);

        String s2 =
                """
                Java Selenium.
                Java is based on OOPS
                Selenium is mainly to interact with browser.
                """;


        System.out.println(s2);

        String s3 = "Test";
        System.out.println((s3 + "-").repeat(100));
    }
}
//99 line
// s = "test " * 20
// index, length,
/*
Java Selenium.
Java is based on OOPS
Selenium is mainly to interact with browser.
 */