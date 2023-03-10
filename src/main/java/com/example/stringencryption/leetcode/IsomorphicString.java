package com.example.stringencryption.leetcode;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;//if not then we return false ;
        }
        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsValue(t.charAt(i))) {//this is important
                //we check if the value to which we are mapping is already mapped to other character then we don;t change it;
                continue;
            } else {//else we map it ;
                hm.put(s.charAt(i), t.charAt(i));
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(hm.get(s.charAt(i)));
        }
        //then we return it using a comparator ;
        return (sb.toString().equals(t));
    }
}
