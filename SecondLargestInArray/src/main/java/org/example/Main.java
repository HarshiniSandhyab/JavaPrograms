package org.example;

public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        //second largest element
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                   temp=arr[i] ;
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("the second smallest element is"+arr[1]);
    }
}