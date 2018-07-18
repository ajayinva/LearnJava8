package com.aces.learn.java8.recursion;


/**
 *
 */
public class EndX {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xhixhix"));
 }

  /**
   Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

   endX("xxre") → "rexx"
   endX("xxhixx") → "hixxxx"
   endX("xhixhix") → "hihixxx"
   */
  public static String recursiveMethod(String str) {
    if (str.length()==0) return str;
    String first = str.substring(0,1);
    if(first.equals("x")){
      return recursiveMethod(str.substring(1))  + first;
    }
    return first + recursiveMethod(str.substring(1));
  }
}
