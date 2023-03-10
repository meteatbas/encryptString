package com.example.stringencryption.leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, m);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int newArr[] = Arrays.copyOfRange(nums1, 0, m);
//        int newArr1[] = Arrays.copyOfRange(nums2, 0, n);
//        int newArr3[] = new int[m+n];
//        int count = 0;
//        for (int i = 0; i < newArr1.length; i++) {
//            newArr3[i] = newArr1[i];
//            count++;
//        }
//        for (int j = 0; j < newArr.length; j++) {
//            newArr3[count++] = newArr[j];
//        }
//        Arrays.sort(newArr3);
        int j = 0;
        // traversal start from length of nums1
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j++];
        }
    }
}
