package com.example.stringencryption.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0};
        containsNearbyDuplicate(nums1, 3);

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];

            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k) {
                return true;
            }

            hashMap.put(integer, i);

        }
        return false;
    }
}
