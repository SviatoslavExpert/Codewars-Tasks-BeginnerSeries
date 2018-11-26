/*
Transportation on vacation
After a hard quarter in the office you decide to get some rest on a vacation.
So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
You will need a rental car in order for you to get around in your vacation.
The manager of the car rental makes you some good offers.
Every day you rent the car costs $40. If you rent the car for 7 or more days,
you get $50 off your total. Alternatively, if you rent the car for 3 or more days,
you get $20 off your total.
Write a code that gives out the total amount for different days(d).
 */

package com.gmail.granovskiy.s;

public class Kata {

    public static void main(String[] args) {
        System.out.println("Cost per 2 days: " + rentalCarCost(2));
        System.out.println("Cost per 5 days: " + rentalCarCost(5));
        System.out.println("Cost per 9 days: " + rentalCarCost(9));
    }

    private static final int costPerDay = 40;

    public static int rentalCarCost(int d) {
        if(d < 3) {
            return d * costPerDay;
        }else if(d >= 7) {
            return d * costPerDay - 50;
        }else {
            return d * costPerDay - 20;
        }

    }
}
