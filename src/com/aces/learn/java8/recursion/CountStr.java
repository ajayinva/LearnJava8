package com.aces.learn.java8.recursion;


/**
 *
 */
public class CountStr {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xyx", "x"));
 }

  /**
   Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
   without the sub strings overlapping.


   strCount("catcowcat", "cat") → 2
   strCount("catcowcat", "cow") → 1
   strCount("catcowcat", "dog") → 0
   */
  public static int recursiveMethod(String str, String sub) {
    if (str.length() < sub.length()) return 0;
    String isSub = str.substring(0,sub.length());
    String remainder = str.substring(1,str.length());
    int count = 0;
    if (isSub.equals(sub)) {
      count = 1;
      remainder = str.substring(sub.length(),str.length());
    }
    return count + recursiveMethod(remainder, sub);
  }
}
