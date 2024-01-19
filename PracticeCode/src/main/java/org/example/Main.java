package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "osumei";
        char word[] = s.toCharArray();
        char temp;
        for (int i = 0; i < word.length; i++) {
            if (word[i] != 'a' || word[i] != 'e' || word[i] != 'i' || word[i] != 'o' || word[i] != 'u') {
                for (int j = i + 1; j < word.length; j++) {
                    {
                        if (word[j] == 'a' || word[j] == 'e' || word[j] == 'i' || word[j] == 'o' || word[j] == 'u') {
                            temp = word[i];
                            word[i] = word[j];
                            word[j] = temp;
                        }
                    }
                }
            }
            System.out.print(word[i]);
        }
    }
}



