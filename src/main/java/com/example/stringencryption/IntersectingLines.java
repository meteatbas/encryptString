package com.example.stringencryption;

import java.util.Arrays;
import java.util.TreeSet;

import static java.util.stream.Collectors.toCollection;

public class IntersectingLines {
    public static String FindIntersection(String[] strArr) {
        TreeSet<Integer> set1 = Arrays.stream(strArr[0].replaceAll("[\\[\\](){}]", "").replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        TreeSet<Integer> set2 = Arrays.stream(strArr[1].replaceAll("[\\[\\](){}]", "").replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        set1.retainAll(set2);

        return (set1.isEmpty() ? "No Intersection" : Arrays.toString(new TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ", ""));
    }

    public static void main(String[] args) {
//        System.out.print(FindIntersection(new String[] {"(1, 3, 4, 7, 13)", "(12, 88, 6, 13, 15)"}));
        System.out.print(FindIntersection(new String[]{"(-1,-4)", "(1,3)"}));
    }

    public static String FindIntersectiodn(String[] strArr) {
        String str1[] = strArr[0].replaceAll("[\\[\\](){}]", "").split(", ");
        String str2[] = strArr[1].replaceAll("[\\[\\](){}]", "").split(", ");
        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        while (i < str1.length && j < str2.length) {
            if (Integer.parseInt(str1[i]) == Integer.parseInt(str2[j])) {
                ans.append(str1[i] + ",");
                i++;
                j++;
            } else if (Integer.parseInt(str1[i]) > Integer.parseInt(str2[j])) {
                j++;
            } else {
                i++;
            }
        }
        if (ans.toString().length() == 0)
            strArr[0] = "No Intersection";
        else {
            String anser = ans.toString().substring(0, ans.toString().length() - 1);
            strArr[0] = anser;
        }
        return strArr[0];
    }
}
