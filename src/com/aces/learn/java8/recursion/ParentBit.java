package com.aces.learn.java8.recursion;


/**
 *
 */
public class ParentBit {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xyz(abc)123"));
 }

  /**
   Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the
   parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
   parenBit("xyz(abc)123") → "(abc)"
   parenBit("x(hello)") → "(hello)"
   parenBit("(xy)1") → "(xy)"
   */
  public static String recursiveMethod(String str) {
    if (str.startsWith("(")){
      if (str.endsWith(")")){
         return str;
      }
      return recursiveMethod(str.substring(0,str.length()-1));
    }
    return recursiveMethod(str.substring(1,str.length()));
  }
}
