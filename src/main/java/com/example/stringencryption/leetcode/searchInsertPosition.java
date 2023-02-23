package com.example.stringencryption.leetcode;

import java.util.Arrays;

public class searchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8, 0};
        Arrays.sort(arr);
        System.out.println(arr);
//        searchInsert(arr,5);
        System.out.println(searchInserttt(arr, 6));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i <= nums.length; i++)
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        return nums.length;


    }

    public static int searchInsertt(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int searchInserttt(int[] nums, int target) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c++;
            if (target <= nums[i]) {
                return i;
            }
        }
        return c;
    }
}
