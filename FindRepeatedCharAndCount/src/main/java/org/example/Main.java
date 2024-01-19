package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "flower blooms";
        String word = s.replaceAll("\\s+", "");
        char[] arrword = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character value : arrword) {
            if (map.containsKey(value)) {
                int count = map.get(value);
                map.put(value, count + 1);
            } else {
                map.put(value, 1);
            }
        }
        System.out.println(map);

        }
}