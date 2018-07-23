package com.aces.learn.java8.recursion;


/**
 *
 */
public class CleanString {
 public static void main (String[] args){
   System.out.println(recursiveMethod("abbbcdd"));
 }

  /**
   Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char.
   So "yyzzza" yields "yza".

   stringClean("yyzzza") → "yza"
   stringClean("abbbcdd") → "abcd"
   stringClean("Hello") → "Helo"
   */
  public static String recursiveMethod(String str) {
    if (str.length() < 2) return str;
    if (str.charAt(0) == str.charAt(1))
      return recursiveMethod(str.substring(1));
    else
      return str.charAt(0) + recursiveMethod(str.substring(1));

   /* if (str.length()==0) return "";
    String char1 = str.substring(0,1);
    String remainder = str.substring(1);
    if (char1.equals(remainder)) return char1;
    for (int i = 1;i<str.length();i++){
       if(!char1.equals(str.substring(i,i+1))){
         remainder = str.substring(i);
         break;
       }
    }
    return char1 + recursiveMethod(remainder);*/
  }
}
