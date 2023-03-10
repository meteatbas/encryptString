package com.example.stringencryption.leetcode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        hammingWeight(00000000000000000000000000001011);
    }

    public static int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
//            TODO: & operator to find odd and even numbers
            ans = ans + (n & 1);
            n = n >> 1;
        }
        return ans;
    }
}
