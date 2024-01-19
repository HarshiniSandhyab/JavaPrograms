package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silents";
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("words are anagram");
        } else {
            System.out.println("words are not anagram");
        }
    }
}