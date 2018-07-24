package com.aces.learn.java8.recursion;


/**
 *
 */
public class NestParen {
 public static void main (String[] args){
   System.out.println(recursiveMethod("((()))"));
 }

  /**
   Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "(((X)))".
   Suggestion: check the first and last chars, and then recur on what's inside them.

   nestParen("(())") → true
   nestParen("((()))") → true
   nestParen("(((x))") → false
   */
  public static boolean recursiveMethod(String str) {
    if (str.length() == 0) return true;
    if (str.startsWith("(") && str.endsWith(")")){
      return recursiveMethod(str.substring(1,str.length()-1));
    }
    return false;
  }
}
