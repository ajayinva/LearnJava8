package com.aces.learn.java8.recursion;


/**
 *
 */
public class CountPairs {
 public static void main (String[] args){
   System.out.println(recursiveMethod("axa"));
 }

  /**
   We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap,
   so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

   countPairs("axa") → 1
   countPairs("axax") → 2
   countPairs("axbx") → 1
   */
  public static int recursiveMethod(String str) {
    if (str.length()<=2) return 0;
    String first = str.substring(0,1);
    String third = str.substring(2,3);
    String remainder = str.substring(1);
    int count = 0;
    if (first.equals(third)) count = 1;
    return count + recursiveMethod(remainder);
  }
}
