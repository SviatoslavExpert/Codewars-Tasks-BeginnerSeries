/*
Beginner Series #2 Clock
Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
Your task is to make 'Past' function which returns time converted to miliseconds.

#####Example:
Past(0, 1, 1) == 61000
Note! h, m and s will be only Natural numbers!
 */

package com.gmail.granovskiy.s;

public class Clock {

    public static void main(String[]args) {
        System.out.println(Past(0,1,1));
    }

    public static int Past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }
}