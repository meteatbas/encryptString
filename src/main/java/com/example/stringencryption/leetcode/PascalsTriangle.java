package com.example.stringencryption.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        ArrayList<Integer> previousRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(j, 1);
                } else {
                    currentRow.add(j, previousRow.get(j) + previousRow.get(j - 1));
                }
            }
            previousRow = currentRow;
            finalList.add(i, currentRow);
        }
        return finalList;
    }
}
