package com.example.stringencryption.leetcode;

import java.util.*;

public class LetterCombinationOfaPhoneNumber {
    static char[][] letters = new char[][]{
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "45";
        System.out.println(letterCombinationsd(digits));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        Set<String> set = new HashSet<>();
        int numOfCombinations = 1;
        for (int i = 0; i < digits.length(); i++) {
            int len = letters[digits.charAt(i) - '0' - 2].length;
            numOfCombinations *= len;
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while (set.size() < numOfCombinations) {
            for (int i = 0; i < digits.length(); i++) {
                char[] temp = letters[digits.charAt(i) - '0' - 2];
                int idx = random.nextInt(temp.length);
                sb.append(temp[idx]);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return new ArrayList<>(set);

    }

    public static List<String> letterCombinationss(String digits) {
        List<String> ret = new LinkedList<String>();
        combination("", digits, 0, ret);
        return ret;
    }

    private static void combination(String prefix, String digits, int offset, List<String> ret) {
        if (offset >= digits.length()) {
            ret.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, offset + 1, ret);
        }

    }

    public static List<String> letterCombinationsd(String digits) {
        List<String> list = new LinkedList<>();
        if (digits == null || digits.length() == 0) return list;
        char[][] map = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        backtrack(digits, list, map, new StringBuilder(), 0);
        return list;
    }

    private static void backtrack(String digits, List<String> list, char[][] map, StringBuilder sb, int start) {
        if (start == digits.length()) {
            list.add(new String(sb));
            return;
        }
        int num = digits.charAt(start) - '0';
        for (int i = 0; i < map[num].length; i++) {
            sb.append(map[num][i]);
            backtrack(digits, list, map, sb, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
