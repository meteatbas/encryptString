package com.example.stringencryption.leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 0, 0, 4, 6, 9, 9, 8};
        System.out.println(plusOnee(arr));
    }

    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        } else {
            StringBuilder s = new StringBuilder();

            for (int i : digits) {
                s.append(i); //add all the ints to a string
            }

//            Integer.parseInt(s.toString());


            if (s.toString().matches("-?\\d+")) {
                int kk = Integer.parseInt(s.toString()) + 1;

                String temp = Integer.toString(kk);
                int[] newGuess = new int[temp.length()];
                for (int i = 0; i < temp.length(); i++) {
                    newGuess[i] = temp.charAt(i) - '0';
                }
                digits = newGuess;
            }
        }
        return digits;
    }

    public static int[] plusOnee(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
