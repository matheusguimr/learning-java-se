package com.essentialtraining;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumericStrings {
    public static void main(String[] args) {
        Locale locale = new Locale("da", "DK");

        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat numF2 = NumberFormat.getNumberInstance(locale);
        System.out.println("Number in Locale: " + numF2.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }
}
