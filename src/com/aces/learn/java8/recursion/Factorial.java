package com.aces.learn.java8.recursion;


/**
 *
 */
public class Factorial {
 public static void main (String[] args){
   System.out.println(recursiveMethod(4));
 }

  /**
   * 
   * @param n
   * @return
   */
 public static Integer recursiveMethod(Integer n){
   if (n == 0) return 0;
   if (n == 1) return 1;
   return n*recursiveMethod(n-1);
 }
}
