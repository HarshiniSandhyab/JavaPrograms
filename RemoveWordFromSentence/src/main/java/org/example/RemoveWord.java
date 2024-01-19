package org.example;

public class RemoveWord {
    public static void main(String[] args)
    {
        String s="what a wonderfull day it is was";
        s=s.replaceAll("was","");
        s=s.trim();
        System.out.print(s);
    }
}