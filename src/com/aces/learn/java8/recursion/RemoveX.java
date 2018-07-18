package com.aces.learn.java8.recursion;


/**
 *
 */
public class RemoveX {
 public static void main (String[] args){
   System.out.println(recursiveMethod("abc"));
 }

  /**
   Given a string, compute recursively a new string where all the 'x' chars have been removed.
   noX("xaxb") → "ab"
   noX("abc") → "abc"
   noX("xx") → ""
   */
  public static String recursiveMethod(String str) {
    if (str.length()==0) return "";
    String x = str.substring(0,1);
    String remainder = str.substring(1,str.length());
    if (x.equals("x")) {
      x = "";
    }
    return x + recursiveMethod(remainder);
  }
}
