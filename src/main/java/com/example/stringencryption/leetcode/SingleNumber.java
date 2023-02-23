package com.example.stringencryption.leetcode;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {5, 5, 2, 6, 6};
        System.out.println(singleNumberr(arr));
    }

    public static int singleNumber(int[] nums) {


        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];

        }

        return ans;
    }

    public static int singleNumberr(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
