package org.example;

public class Main {
    public static void main(String[] args) {

        int arr[] = {5, 10, 15, 20, 25, 30};
        int sum = 30;
        Boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.print("the numbers are "+arr[i] + " " + arr[j]);
                    found=true;
                }
                }
            }
        if(!found)
            System.out.println("no values which gives sum" + sum);
    }
}