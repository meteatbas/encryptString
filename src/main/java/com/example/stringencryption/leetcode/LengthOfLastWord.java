package com.example.stringencryption.leetcode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWordddd("t1e1s2t, Hell1o, 1th1e, fir2st1 yasoo22262odt yasoo2222ohhht yu2u ym2u");
    }

    public static void lengthOfLastWord(String str) {
        String[] splited = str.split("\\s+");
        Arrays.asList(splited);

        System.out.println(splited.length);
    }

    public static int lengthOfLastWordd(String s) {
        char[] arr = s.toCharArray();

        int len = 0;

        boolean flag = false;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != ' ' && flag != true) {
                flag = true;
            }

            if (flag && arr[i] != ' ') len++;

            else if (flag && arr[i] == ' ') break;

        }
        return len;
    }

    public static int lengthOfLastWordf(String s) {
        String trim = s.trim();

        char[] ch = trim.toCharArray();

        int cnt = 0;

        for (int i = ch.length - 1; i >= 0; i--) {
            cnt++;

            if (ch[i] == ' ') {
                return cnt - 1;
            }
        }
        return cnt;
    }

    public static int lengthOfLastWordddd(String s) {
        s = s.trim();

        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {

                c = 0;
                continue;

            } else

                c++;

        }
        return c;
    }

}
