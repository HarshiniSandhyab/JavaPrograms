package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Boolean isPrime=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num+"is a prime number");
        }
        else {
            System.out.println(num+"is not prime number");
        }

    }
}