package org.example;

public class PalindromeString {
    public static void main(String[] args) {
        String s="level";
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1))
        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("not a palindrome");
        }

    }
}