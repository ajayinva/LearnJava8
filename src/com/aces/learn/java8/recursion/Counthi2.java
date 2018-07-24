package com.aces.learn.java8.recursion;


/**
 *
 */
public class Counthi2 {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xhim"));
 }

  /**
   Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x'
   immediately before them.
   countHi2("ahixhi") → 1
   countHi2("ahibhi") → 2
   countHi2("xhixhi") → 0
   */
  public static int recursiveMethod(String str) {
    if (str.length()<2) return 0;
    if (str.startsWith("xhi"))
      return 0 + recursiveMethod(str.substring(3,str.length()));
    else if (str.startsWith("hi"))
      return 1 + recursiveMethod(str.substring(2,str.length()));
    else
      return 0 + recursiveMethod(str.substring(1,str.length()));
  }
}
