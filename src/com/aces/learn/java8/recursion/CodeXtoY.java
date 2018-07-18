package com.aces.learn.java8.recursion;


/**
 *
 */
public class CodeXtoY {
 public static void main (String[] args){
   System.out.println(recursiveMethod("xxhixx"));
 }

  /**
   Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
   changeXY("codex") → "codey"
   changeXY("xxhixx") → "yyhiyy"
   changeXY("xhixhix") → "yhiyhiy"
   */
  public static String recursiveMethod(String str) {
    if (str.length()==0) return "";
    String x = str.substring(0,1);
    String remainder = str.substring(1,str.length());
    if (x.equals("x")) x = "y";
    return x + recursiveMethod(remainder);
  }
}
