package com.essentialtraining;

public class Chars {
    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '1';
        char c3 = '1';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        char dollarSign = '\u0024';
        System.out.println(dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.println(Character.toUpperCase(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s = new String(chars);
        System.out.println(s);

        char[] chars2 = s.toCharArray();
        for (char c : chars2) {
            System.out.println(c);
        }
    }
}
