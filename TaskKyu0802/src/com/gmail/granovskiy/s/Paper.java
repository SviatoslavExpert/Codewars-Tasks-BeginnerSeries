/*
Beginner Series #1 School Paperwork
Your classmates asked you to copy some paperwork for them.
You know that there are 'n' classmates and the paperwork has 'm' pages.
Your task is to calculate how many blank pages do you need.

Example:
Paperwork(5, 5) == 25
Note! if n or m < 0 return 0!
 */

package com.gmail.granovskiy.s;

public class Paper {

    public static void main(String[] args) {
        System.out.println(paperwork(5,7));
    }

    public static int paperwork(int n, int m) {
        if(n < 0 || m < 0)
            return 0;
        else return n * m;
    }
}
