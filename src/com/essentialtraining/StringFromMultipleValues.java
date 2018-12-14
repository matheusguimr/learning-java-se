package com.essentialtraining;

import java.util.Scanner;

public class StringFromMultipleValues {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!"; // I did create 3 Objects
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb); // I did create just one Object, this is better for
        // memory management

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);

        String s1 = "Hello"; // This just pointed the Object str1;
        String s2 = "hello";
        if (s1.equalsIgnoreCase(s2)) { // The most trustful way to compare string is with .equals
            System.out.println("They match");
        } else
            System.out.println("They don't match");
    }
}
