package com.aces.learn.java8.recursion;


/**
 *
 */
public class ChangePi {
 public static void main (String[] args){
   System.out.println(recursiveMethod("pip"));
 }

  /**
   Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

   changePi("xpix") → "x3.14x"
   changePi("pipi") → "3.143.14"
   changePi("pip") → "3.14p"
   */
  public static String recursiveMethod(String str) {
    if (str.length()==0) return "";
    if (str.length()==1) return str;
    String pi = str.substring(0,2);
    String remainder = null;
    if (pi.equals("pi")) {
      pi = "3.14";
      remainder = str.substring(2,str.length());
    }
    else {
      pi = str.substring(0,1);
      remainder = str.substring(1,str.length());
    }
    return pi + recursiveMethod(remainder);
  }
}
