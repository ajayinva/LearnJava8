package com.aces.learn.java8.recursion;


/**
 *
 */
public class Count11 {
 public static void main (String[] args){
   System.out.println(recursiveMethod("11abc11"));
 }

  /**
   Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
   count11("11abc11") → 2
   count11("abc11x11x11") → 3
   count11("111") → 1
   */
  public static int recursiveMethod(String str) {
    if (str.length()<=1) return 0;
    String eleven = str.substring(0,2);
    String remainder = str.substring(1);
    int count = 0;
    if (eleven.equals("11")){
      count = 1;
      remainder = str.substring(2);
    }
    return count + recursiveMethod(remainder);
  }
}
