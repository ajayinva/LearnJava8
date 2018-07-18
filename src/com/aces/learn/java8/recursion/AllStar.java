package com.aces.learn.java8.recursion;


/**
 *
 */
public class AllStar {
 public static void main (String[] args){
   System.out.println(recursiveMethod("hello"));
 }

  /**
   Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
   allStar("hello") → "h*e*l*l*o"
   allStar("abc") → "a*b*c"
   allStar("ab") → "a*b"
   */
  public static String recursiveMethod(String str) {
    if (str.length()<=1) return str;
    return str.substring(0,1)+"*" + recursiveMethod(str.substring(1));
  }
}
