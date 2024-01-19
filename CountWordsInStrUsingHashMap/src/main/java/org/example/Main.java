package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str="java programming language";
        HashMap<String,Integer> map=new HashMap<>();
        String word[]=str.split(" ");
        for(int i=0;i< word.length;i++)
        {
            if(map.containsKey(word[i]))
            {
                int count=map.get(word[i]);
                map.put(word[i],count+1);
            }
            else
            {
                map.put(word[i],1);
            }
        }
        System.out.println(map);
    }
}