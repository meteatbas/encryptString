package com.example.stringencryption.leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;

        for (char ch : columnTitle.toCharArray()) {
            int diff = ch - ('A' - 1);

            sum = sum * 26 + diff;

        }

        return sum;
    }
}
