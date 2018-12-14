package com.essentialtraining;

import java.text.NumberFormat;

public class PrimitivesToStrings {
    public static void main(String[] args) {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean booleanValue = true;
        String fromBool = Boolean.toString(booleanValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        double doubleValue = 1_234_567.89;
        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));
    }
}
