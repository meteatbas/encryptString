package com.example.stringencryption.leetcode;

public class Palindrome {

    public static void main(String args[]) {
        String checkThis = new String("seladfodales");
        solvePalindrome(checkThis);
        if (solvePalindrome(checkThis)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean solvePalindrome(String str) {

        StringBuilder reversedWord = new StringBuilder();

        for (int j = str.length() - 1; j >= 0; j--) {
            reversedWord.append(str.charAt(j));
        }

        return str.equals(reversedWord.toString());

//        for (int i=0;i<str.length();i++){
//            if (str.charAt(i) == str.charAt(str.length()-i-1)){
//                System.out.println(str.charAt(i));
//            }else{
//                return false;
//            }
//        }
    }
}
