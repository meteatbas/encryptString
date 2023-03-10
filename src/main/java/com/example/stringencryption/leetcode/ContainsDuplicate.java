package com.example.stringencryption.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        containsDuplicate(nums1);
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> cars = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            cars.add(nums[i]);
        }

        if (cars.size()==nums.length){
            return true;
        }else{
            return false;
        }
    }
}
