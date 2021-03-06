package com.aces.learn.java8.recursion;


/**
 *
 */
public class NoOfEight {
 public static void main (String[] args){
   System.out.println(recursiveMethod(8818818));
 }

  /**
   Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
   except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
   Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
   the rightmost digit (126 / 10 is 12).

   count8(8) → 1
   count8(818) → 2
   count8(8818) → 4
   */
  public static int recursiveMethod(int n) {
    int count = 0;
    int remainder = n%10;
    int quotient = n/10;
    if (quotient == 0) {
      if (remainder == 8) count++;
      return count;
    }
    if (remainder == 8) {
      count++;
      int remainder100 = n % 100;
      if (remainder100 == 88) {
        count++;
      }
    }
    return count + recursiveMethod(quotient);
  }
}
