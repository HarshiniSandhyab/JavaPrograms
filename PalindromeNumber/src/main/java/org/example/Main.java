package org.example;

public class Main {
    public static void main(String[] args) {
        int num=323;
        int actualnum=323;
        int rev=0;
        while(num>0)
        {
            int a=num%10;
            rev=rev*10+a;
            num=num/10;
        }
        if(actualnum==rev)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }

    }
}