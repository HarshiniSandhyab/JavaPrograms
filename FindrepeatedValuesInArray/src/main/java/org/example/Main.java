package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int a[]={2,3,4,5,5,5,5,7,8,9,9};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int count=map.get(a[i]);
                map.put(a[i],count+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        for(int data:map.keySet())
        {
            if(map.get(data)>1)
            {
                System.out.println(data+" is repeated "+map.get(data)+" times");
            }
        }
    }
}