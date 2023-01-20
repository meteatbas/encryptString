package com.example.stringencryption;

import java.util.*;

class BubbleSort {
    void bubbleSort(int arr[])
    {
        int lengthOfArray = arr.length;
        for (int i = 0; i < lengthOfArray - 1; i++)
            for (int j = 0; j < lengthOfArray - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 1, 4, 2, 8,0 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}

