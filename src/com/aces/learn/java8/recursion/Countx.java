package com.aces.learn.java8.recursion;


/**
 *
 */
public class Countx {
 public static void main (String[] args){
   System.out.println(recursiveMethod("x"));
 }

  /**
   Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
   countX("xxhixx") → 4
   countX("xhixhix") → 3
   countX("hi") → 0
   */
  public static int recursiveMethod(String str) {
    if (str.length()==0) return 0;
    String isX = str.substring(0,1);
    String remainder = str.substring(1,str.length());
    int count = 0;
    if (isX.equals("x")) count = 1;
    return count + recursiveMethod(remainder);
  }
}
