package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String s = "aabbbcdd";
        int[] arr = new int[256];

        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            //System.out.println(arr[s.charAt(i)]);
        }

        char minChar = ' ';
        int minCount = Integer.MAX_VALUE;


        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] > 0 && arr[s.charAt(i)] < minCount) {

               // System.out.println(arr[s.charAt(i)]);
                minCount = arr[s.charAt(i)];
                minChar = s.charAt(i);
            }
        }

        System.out.println("Character with minimum occurrence: " + minChar);
        System.out.println(minCount);
    }
}
