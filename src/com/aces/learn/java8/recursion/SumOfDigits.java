package com.aces.learn.java8.recursion;


/**
 *
 */
public class SumOfDigits {
 public static void main (String[] args){
   System.out.println(recursiveMethod(1234));
 }

  /**
   Given a non-negative int n, return the sum of its digits recursively (no loops).
   Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
   the rightmost digit (126 / 10 is 12).

   sumDigits(126) → 9
   sumDigits(49) → 13
   sumDigits(12) → 3
   */
  public static int recursiveMethod(int n) {
    int remainder = n%10;
    int quotient = n/10;
    if (quotient == 0) return remainder;
    return remainder + recursiveMethod(quotient);
  }
}
