package com.aces.learn.java8.recursion;
/**
 *
 */
public class StrDist {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xyx", "y"));
 }

  /**
   Given a string and a non-empty substring sub, compute recursively the largest substring which starts and
   ends with sub and return its length.

   strDist("catcowcat", "cat") → 9
   strDist("catcowcat", "cow") → 3
   strDist("cccatcowcatxx", "cat") → 9
   */
  public static int recursiveMethod(String str, String sub) {
    if(str.length() < sub.length()) return 0;
    if(str.startsWith(sub) && str.endsWith(sub)) return str.length();
    if(!str.startsWith(sub)) return recursiveMethod(str.substring(1), sub);
    return recursiveMethod(str.substring(0, str.length()-1), sub);
  }
}
