package org.example;

import java.util.Scanner;

public class ClockAngel {
        static Scanner scn = new Scanner(System.in);
        public static void main (String[] args) {
            int hr = scn.nextInt();
            int min = scn.nextInt();
            int ans = findAngle(hr,min);
            System.out.println(ans);
        }
        static int findAngle(int hr, int min){
            int hour = (hr*30) + (int)(min*0.5);
            int minutes =  min*(6) ;
            int ans = Math.abs(hour-minutes);

            if(ans>180){
                return 360-ans;
            }
            return ans ;
    }
}
