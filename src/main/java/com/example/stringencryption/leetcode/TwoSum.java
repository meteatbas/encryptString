package com.example.stringencryption.leetcode;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int[] numd = new int[]{2, 7, 11, 15, 56};
        System.out.println(Arrays.toString(twoSum(numd, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

// check if the array contains subtract of the target
            if (map.containsKey(target - nums[i])) {

                arr[0] = map.get(target - nums[i]);

                arr[1] = i;

                return arr;

            }

            map.put(nums[i], i);
//            System.out.println(map.get(1));
        }
        return arr;
    }


}
