package org.example;

import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
        int a[]={10,20,30,30,30,40};
        int b[]={70,80,90};
        int a1=a.length;
        int a2=b.length;
        int a3=a1+a2;
        int c[]=new int[a3];
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<a1;i++)
        {
            h.add(a[i]);
        }
        for(int i=0;i<a2;i++)
        {
            h.add(b[i]);
        }
        List<Integer> list = new ArrayList<>(h);
        // Step 2: Sort the List
        Collections.sort(list);
        System.out.println(list);
    }

}
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        for (Integer i : arr1){
//            treeSet.add(i);
//        }
//        for (Integer i : arr2){
//            treeSet.add(i);
//        }
//        System.out.println(treeSet);


