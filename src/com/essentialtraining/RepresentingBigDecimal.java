package com.essentialtraining;

import java.math.BigDecimal;

public class RepresentingBigDecimal {
    public static void main(String[] args) {
        double value = .012;
        double sumOfValue = value + value + value;
        System.out.println("Sum of primitives: " + sumOfValue);

        String strValue = Double.toString(value);
        System.out.println(strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal sumOfValue2 = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of Big Decimals: " + sumOfValue2.toString());
    }
}
