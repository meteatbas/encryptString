package com.example.stringencryption.leetcode;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairr(2));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }

    public static int dd(int n) {
        int memo[] = new int[n + 1];
        Arrays.fill(memo, -1);
        return cli(n - 1, memo) + cli(n - 2, memo);
    }

    private static int cli(int n, int[] memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            memo[n] = 1;
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = cli(n - 1, memo) + cli(n - 2, memo);
        return memo[n];
    }

    private static int climbStairr(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
