package com.example.stringencryption.leetcode;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] names1 = new int[]{2,3,4};
        findMajor(names1);
    }

    public static int findMajor(int arr[]){
        int size = arr.length;

// Sorting the array
        Arrays.sort(arr);
        int count = 1;
        for(int i = 1; i < size; i++)
        {
            if(arr[i] == arr[i - 1])
            {
                // finding the count of the elements
                // that have the same value
                count = count + 1;
            }
            else
            {
                // if the value of the count is more than
                // the half of the size of the input array,
                // then the majority element is found and we return 1
                if(count > (size / 2))
                {
                    return 1;
                }
                count = 1;
            }
        }

// the last group of elements of the same value
// can also be the majority element
// this check is especially for that last group
        if(count > (size / 2))
        {
            return 1;
        }

// if the control reaches here, then it means
// the majority element is not found.
        return -1;
    }
}
