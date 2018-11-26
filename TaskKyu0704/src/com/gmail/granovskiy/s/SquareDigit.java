/*
Square Every Digit
Welcome. In this kata, you are asked to square every digit of a number.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
Note: The function accepts an integer and returns an integer
 */

package com.gmail.granovskiy.s;

public class SquareDigit {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        int length = String.valueOf(n).length();
        int[] arr = new int[length];
        int result;
        //  splitting number into digits and filling array
        int j = length;
        for (int i = 0; i < length; i++) {
            arr[i] = n % ((int) (Math.pow(10, j))) / (int) (Math.pow(10, j - 1));
            j--;
        }
        //  making square every digit of the array
        for (int i = 0; i < length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        //  making string from squared digits
        String num = "";
        for (int i = 0; i < length; i++) {
            num = num + arr[i];
        }
        //  turning the string into integer
        result = Integer.parseInt(num);
        return result;
    }

}
