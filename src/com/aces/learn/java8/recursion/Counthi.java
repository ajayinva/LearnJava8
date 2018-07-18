package com.aces.learn.java8.recursion;


/**
 *
 */
public class Counthi {
 public static void main (String[] args){
   System.out.println(recursiveMethod("hi"));
 }

  /**
   Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
   countHi("xxhixx") → 1
   countHi("xhixhix") → 2
   countHi("hi") → 1
   */
  public static int recursiveMethod(String str) {
    if (str.length()==1 || str.length()==0) return 0;
    String isHi = str.substring(0,2);
    String remainder = str.substring(1,str.length());
    int count = 0;
    if (isHi.equals("hi")) count = 1;
    return count + recursiveMethod(remainder);
  }
}
