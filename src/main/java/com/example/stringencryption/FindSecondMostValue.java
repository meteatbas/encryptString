package com.example.stringencryption;

import java.util.*;

public class FindSecondMostValue {
    public static void main(String args[]) {
        int[] myArray = {13, 6, 14, 15, 5, 1, 4, 2, 8, 0};
//        Arrays.sort(myArray, Collections.reverseOrder());
        Set<int[]> mySet = new HashSet<>(Arrays.asList(myArray));
//        TreeSet<Integer[]> myTreeSet=new TreeSet<>(mySet);
        List<Integer> list = new ArrayList<>();

        Integer[] wrappedInts = Arrays.stream(myArray)
                .boxed()
                .toArray(Integer[]::new);

        int[] unwrappedInts = Arrays.stream(wrappedInts)
                .mapToInt(Integer::intValue)
                .toArray();

        for (Integer wrappedIntsd : wrappedInts) {
            list.add(wrappedIntsd);
        }


        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

//        List list = new ArrayList(mySet);

//        Collections.sort(list, Collections.reverseOrder());

        int secondLargest = myArray[myArray.length - 2];

        int second;
        int largest = second = Integer.MIN_VALUE;
        bubbleSort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            integerList.add(myArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != largest)
                second = Math.max(second, myArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != largest)
                second = Math.max(second, myArray[i]);
        }
        System.out.println("Second largest number: " + second);
    }

    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
