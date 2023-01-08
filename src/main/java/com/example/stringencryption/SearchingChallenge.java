package com.example.stringencryption;

public class SearchingChallenge {
    public static String SearchingChallengee(String str) {
        int leftBrack = 0, rightBrack = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ('(')) {
                leftBrack = leftBrack + 1;

            } else if (str.charAt(i) == (')')) {
                rightBrack = rightBrack + 1;

            }
        }
//        if (leftBrack == rightBrack) {
//            str = "1";
//        } else {
//            str = "0";
//        }

        char[] myNameChars = str.toCharArray();
        for (int i = 0; i < myNameChars.length; i = i + 2) {
            myNameChars[i] = 'X';
        }

        return String.valueOf(myNameChars);
    }

    public static void main(String[] args) {
        System.out.println(SearchingChallengee("((hello (world))"));

    }
}
