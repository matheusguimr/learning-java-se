package com.essentialtraining;

public class BooleanValues {
    static boolean bDef;

    public static void main(String[] args) {
        System.out.println(bDef);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println(parsed);
    }
}
