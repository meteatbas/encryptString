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

        String str = "t1e1s2t, Hell1o, 1th1e, fir2st1 yasoo2222ot yasoo2222ot 11 33 yu2u" ;
        String[] splited = str.split("\\s+");
        Map<String, Integer> myHashMap = new HashMap<>();


        for (String strPart : splited) {
            int count = 0;
            for (int i = 0; i < strPart.length(); i++) {
                if (Character.isDigit(strPart.charAt(i))) {
                    count = count + Integer.parseInt(String.valueOf(strPart.charAt(i)));
                }
            }
            myHashMap.put(strPart.replaceAll("[0-9]", "").replaceAll(",", ""), count);
        }
        Set<String> set = new  HashSet<>();



        myHashMap = myHashMap.entrySet().stream()
                .filter(entry -> set.add(String.valueOf(entry.getValue())))
                .collect(Collectors.toMap(Map.Entry :: getKey ,  Map.Entry :: getValue));
        System.out.printf("after => " + myHashMap);

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
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue
            (Map<K, V> map) {

        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<K, V> comparingByValue().reversed())
                // Type here -----^ reversed() here -------^
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
