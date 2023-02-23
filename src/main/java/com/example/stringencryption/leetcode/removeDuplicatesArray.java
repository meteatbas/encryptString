package com.example.stringencryption.leetcode;

public class removeDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }

        return index;
    }
}
