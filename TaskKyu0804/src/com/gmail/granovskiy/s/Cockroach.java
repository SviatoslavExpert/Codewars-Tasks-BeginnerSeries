/*
Beginner Series #4 Cockroach
The cockroach is one of the fastest insects. Write a function
which takes its speed in km per hour and returns it in cm per second,
rounded down to the integer (= floored).

For example:
CockroachSpeed(1.08) == 30
Note! The input is a Real number (actual type is language dependent) and is >= 0.
The result should be an Integer.
 */

package com.gmail.granovskiy.s;

public class Cockroach{

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }

    public static int cockroachSpeed(double x){
        int y =  (int) Math.floor(x * 27.77777778);
        return y;
    }
}
