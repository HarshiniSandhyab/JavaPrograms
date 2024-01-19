package org.example;

public class Main {
    public static void main(String[] args) {
//      String s="it is a good day";  //ti si a doog yad
//        String s1[]=s.split(" ");
//        String actual="";
//        for(String word:s1)
//        {
//            String rev="";
//            for(int i=word.length()-1;i>=0;i--)
//            {
//                rev=rev+word.charAt(i);
//            }
//            actual=actual+rev+" ";
//        }
//        System.out.println(actual);
//        *********************************************************************************************
//        String s="it is a good life";  //efil doog a si ti
//        StringBuilder s1=new StringBuilder(s);
//        s1.reverse();
//        String result=s1.toString();
//        System.out.println(result);
//        **********************************************************************************************
        String s="all is well";  //well is all
        String s1[]=s.split(" ");
        String rev="";
        for(int i=s1.length-1;i>=0;i--) {
            rev=rev+s1[i]+" ";

            //System.out.print(s1[i] + " ");

        }
        System.out.println(rev);

    }
}