package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arr[]={10,15,30,25,20,35,40};
        int result[]=new int[arr.length];
        int even_count=0;
        int odd_count= arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
            {
                result[even_count]=arr[i];
                even_count++;
            }
            else if(arr[i]%2!=0)
            {
                result[odd_count]=arr[i];
                odd_count--;
            }
        }
        for(int r:result)
        {
            Arrays.sort(result,0,even_count);
            System.out.print(r+" ");
        }
    }
}