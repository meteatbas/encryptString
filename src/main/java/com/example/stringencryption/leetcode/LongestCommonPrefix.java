package com.example.stringencryption.leetcode;

public class LongestCommonPrefix {
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string ""

    public static void main(String args[]) {
        String[] strArr = new String[]{"flower", "flow", "flight"};
        String res = findLongestPrefix(strArr);
        System.out.println(res);
    }

    public static String findLongestPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {

            String currprefix = strs[i];
            System.out.println(prefix);
            while (!currprefix.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;

    }
}
