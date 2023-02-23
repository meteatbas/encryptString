package com.example.stringencryption.leetcode;

public class removeElementArray {

    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 2, 8, 0};

//        removeElement(arr, 4);
        System.out.println(removeElement(arr,4));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }

        }

        return k;
    }
}
