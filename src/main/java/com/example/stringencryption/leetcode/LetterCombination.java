package com.example.stringencryption.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    /*

    Given a string containing digits from 2-9 inclusive,
     return all possible letter combinations that the number could represent.
      Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below.
 Note that 1 does not map to any letters.
     */
    public static void main(String args[]) {
        String dd = "24";
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};



        calculateDigitsCombination(dd);

    }

    public static List<String> calculateDigitsCombination(String digits) {
         List < String > combinations = new ArrayList < > ();
         Map< Character, String > letters = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
        System.out.println(digits);
        if (digits.length() == 0){
            return new ArrayList<>();
        }


        StringBuilder path=new StringBuilder();

        if (path.length()==digits.length()){
            combinations.add(path.toString());
        }

        String possibleLetters=letters.get(digits.charAt(0));

        for (char letter:possibleLetters.toCharArray()){
            path.append(letter);
            
        }

        return new ArrayList<>();
    }
}
