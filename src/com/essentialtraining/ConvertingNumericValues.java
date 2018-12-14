package com.essentialtraining;

public class ConvertingNumericValues {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = intValue1;

        System.out.println(intValue2);

        long longValue1 = intValue1;
        System.out.println(longValue1);

        //short shortValue1 = intValue1; ERROR
        short shortValue1 = (short) intValue1;
        System.out.println(shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println(byteValue);

        double doubleValue = 3.99999d;
        int intValue4 = (int) doubleValue;
        System.out.println(intValue4);

        intValue1 = 56;
        intValue2 = 42;

        double result1 = (double) intValue1 / intValue2;
        System.out.println(result1);

        doubleValue = -3.999999;
        long rounded = Math.round(doubleValue);
        System.out.println(rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println(absValue);
    }
}
