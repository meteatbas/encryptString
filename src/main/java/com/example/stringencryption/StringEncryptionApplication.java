package com.example.stringencryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class StringEncryptionApplication {

    public static void main(String[] args) {

        SpringApplication.run(StringEncryptionApplication.class, args);
        calcStr();
    }

    public static String calcStr() {

        String str = "t1e1s2t, Hell1o, 1th1e, fir2st1 yasoo22262odt yasoo2222ohhht yu2u ym2u" ;
        String[] splited = str.split("\\s+");
       LinkedHashMap<String, Integer> myHashMap = new LinkedHashMap<>();
        Collections.reverse(Arrays.asList(splited));

        for (String strPart : splited) {
            int count = 0;
            for (int i = 0; i < strPart.length(); i++) {
                if (Character.isDigit(strPart.charAt(i))) {
                    count = count + Integer.parseInt(String.valueOf(strPart.charAt(i)));
                }
            }
            if (!myHashMap.containsValue(count)){
                myHashMap.put(strPart.replaceAll("[0-9]", "").replaceAll(",", ""), count);
            }
        }
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> sortedMapAsc = sortByValue(myHashMap, true);
        sortedMapAsc.forEach((key, value) -> sb.append(key + " "));
        System.out.println(sb);
        return str;
    }
    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap, final boolean order) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        // Sorting the list based on values
        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

    }
}
