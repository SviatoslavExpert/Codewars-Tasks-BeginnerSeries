/*
Beginner Series #3 Sum of Numbers
Given two integers a and b, which can be positive or negative,
find the sum of all the numbers between including them too and return it.

If the two numbers are equal return a or b.
Note: a and b are not ordered!

Examples
GetSum(1, 0) == 1   // 1 + 0 = 1
GetSum(1, 2) == 3   // 1 + 2 = 3
GetSum(0, 1) == 1   // 0 + 1 = 1
GetSum(1, 1) == 1   // 1 Since both are same
GetSum(-1, 0) == -1 // -1 + 0 = -1
GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 */

package com.gmail.granovskiy.s;

public class Sum {

    public static void main(String[] args) {
        System.out.println(GetSum(1,0));
        System.out.println(GetSum(1,2));
        System.out.println(GetSum(0,1));
        System.out.println(GetSum(1,1));
        System.out.println(GetSum(-1,0));
        System.out.println(GetSum(-1,2));
    }

    public static int GetSum(int a, int b) {
        int sum;
        if(a < b) {
            sum = a;
            for(int i = a + 1; i <= b;) {
                sum = sum + i;
                i++;
            }
        } else if(a > b) {
            sum = b;
            for(int i = b + 1; i <= a;) {
                sum = sum + i;
                i++;
            }
        } else {
            sum = a;
        }
        return sum;
    }
}
