package com.aces.learn.java8.recursion;


/**
 *
 */
public class PowerN {
 public static void main (String[] args){
   System.out.println(recursiveMethod(3,3));
 }

  /**
   Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
   powerN(3, 1) → 3
   powerN(3, 2) → 9
   powerN(3, 3) → 27
   */
  public static int recursiveMethod(int base, int n) {
    if (n == 1) return base;
    return base * recursiveMethod(base, n-1);
  }
}
