package com.aces.learn.java8.recursion;


/**
 *
 */
public class NoOfSeven {
 public static void main (String[] args){
   System.out.println(recursiveMethod(727467));
 }

  /**
   Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
   Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
   removes the rightmost digit (126 / 10 is 12).

   count7(717) → 2
   count7(7) → 1
   count7(123) → 0
   */
  public static int recursiveMethod(int n) {
    int remainder = n%10;
    int quotient = n/10;
    if (quotient == 0) {
      if (remainder == 7)
        return 1;
      else
        return 0;
    }
    if (remainder == 7)
      return 1 + recursiveMethod(quotient);
    else
      return 0 + recursiveMethod(quotient);
  }
}
