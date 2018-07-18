package com.aces.learn.java8.recursion;


/**
 *
 */
public class PairStar {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xxyy"));
 }

  /**
   Given a string, compute recursively a new string where identical chars that are adjacent in the original string are
   separated from each other by a "*".

   pairStar("hello") → "hel*lo"
   pairStar("xxyy") → "x*xy*y"
   pairStar("aaaa") → "a*a*a*a"
   */
  public static String recursiveMethod(String str) {
    if (str.length()<=1) return str;
    String first = str.substring(0,1);
    String second = str.substring(1,2);
    if(first.equals(second)){
      first = first+"*";
    }
    return first + recursiveMethod(str.substring(1));
  }
}
