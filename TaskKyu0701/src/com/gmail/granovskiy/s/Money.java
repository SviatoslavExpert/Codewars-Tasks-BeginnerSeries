/*
Mr. Scrooge has a sum of money 'P' that wants to invest,
and he wants to know how many years 'Y' this sum has to be kept
in the bank in order for this sum of money to amount to 'D'.

The sum is kept for 'Y' years in the bank where interest 'I'
is paid yearly, and the new sum is re-invested yearly after paying tax 'T'
Note that the principal is not taxed but only the year's accrued interest
Example:
  Let P be the Principal = 1000.00
  Let I be the Interest Rate = 0.05
  Let T be the Tax Rate = 0.18
  Let D be the Desired Sum = 1100.00
 */

package com.gmail.granovskiy.s;

public class Money {

    public static void main(String[] args) {
        System.out.println(calculateYears(1000.00, 0.05, 0.18, 1100.00));
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal = principal + principal * interest - principal * interest * tax;
            years++;
        }
        return years;
    }
}
