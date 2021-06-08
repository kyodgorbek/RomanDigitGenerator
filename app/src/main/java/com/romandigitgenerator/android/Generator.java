package com.romandigitgenerator.android;

import java.lang.reflect.Array;

public class Generator implements RomanNumeralGenerator {


    @Override
    public String generate(int number) {
        return intToRoman(number);
    }

    private String intToRoman(int num) {
        String[] m = new String[]{"", "M", "MM", "MMM"};
        String[] c = new String[]{
                "", "C", "CC", "CCC", "CD", "D",
                "DC", "DCC", "DCCC", "CM"};
        String[] x = new String[]{
                "", "X", "XX", "XXX", "XL", "L",
                "LX", "LXX", "LXXX", "XC"};
        String[] i = new String[]{
                "", "I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX"};

        // Converting to roman

        String thousands = m[num / 1000];
        String hundreds = c[num % 1000 / 100];
        String tens = x[num % 100 / 10];
        String ones = i[num % 10];

        return thousands + hundreds + tens + ones;


    }
}
