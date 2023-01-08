package com.example.stringencryption;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("abc");
        list.add("Bcd");
        list.add("aAb");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance().compare(o1, o2);
            }
        });
        System.out.println(list);
    }
}
