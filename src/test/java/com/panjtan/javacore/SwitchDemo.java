package com.panjtan.javacore;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter a day: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        String result = fetchDayType(day);
        String result1 = modernSwitch(day);

        System.out.println(day + " is: " + result);
        System.out.println(day + " is: " + result1 + " fetched from Modern");
    }

    static String modernSwitch(String day) {
        String result = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Weekday";
        };
        return result;
    }

    static String fetchDayType(String day) {
        String dayType = "";
        switch (day) {
            case "Sunday":
            case "Saturday":
                dayType = "Weekend";
                break;
            default:
                dayType = "Weekday";
        }

        return dayType;
    }
}
