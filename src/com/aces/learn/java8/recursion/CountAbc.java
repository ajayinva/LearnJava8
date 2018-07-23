package com.aces.learn.java8.recursion;


/**
 *
 */
public class CountAbc {
 public static void main (String[] args){
   System.out.println(recursiveMethod("abaxxaba"));
 }

  /**
   Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
   countAbc("abc") → 1
   countAbc("abcxxabc") → 2
   countAbc("abaxxaba") → 2
   */
  public static int recursiveMethod(String str) {
    if (str.length()<=2) return 0;
    String first = str.substring(0,3);
    String remainder = str.substring(1);
    int count = 0;
    if (first.equals("abc") || first.equals("aba")) count = 1;
    return count + recursiveMethod(remainder);
  }
}
