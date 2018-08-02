package com.aces.learn.java8.recursion;


/**
 *
 */
public class StrCopies {
 public static void main (String[] args){
   System.out.println(recursiveMethod("catcowcat", "cat", 2));
 }

  /**
   Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string
   somewhere, possibly with overlapping. N will be non-negative.

   strCopies("catcowcat", "cat", 2) → true
   strCopies("catcowcat", "cow", 2) → false
   strCopies("catcowcat", "cow", 1) → true
   */
  public static boolean recursiveMethod(String str, String sub, int num) {
    if (num==0) {
      return true;
    } else if (str.length() < sub.length()) {
      return false;
    }
    String isSub = str.substring(0,sub.length());
    String remainder = str.substring(1,str.length());
    if (isSub.equals(sub)) {
      num = num - 1;
    }
    return recursiveMethod(remainder, sub, num);
  }
}
