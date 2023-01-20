package com.example.stringencryption.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MergeArrays {


    public static String[] uniqueNames(String[] names1, String[] names2) {
        String[] dsd = new String[]{};

        Set<String> nedd = new HashSet<String>();
        for (String dt : names1) {
            nedd.add(dt);
        }
        for (String dt : names2) {
            nedd.add(dt);
        }
        int n = names1.length + names2.length;
        String arr[] = new String[n];

        String[] arrd = nedd.stream().toArray(String[]::new);

        arr = nedd.toArray(arr);
        return arrd;
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        uniqueNames(names1, names2);
        System.out.println(uniqueNames(names1, names2));
        for (String word : uniqueNames(names1, names2)) {
            System.out.println(word);
        }
    }

}
