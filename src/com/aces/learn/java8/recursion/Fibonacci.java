package com.aces.learn.java8.recursion;


/**
 *
 */
public class Fibonacci {
 public static void main (String[] args){
   System.out.println(recursiveMethod(7));
 }

  /**
   * 
   * @param n
   * @return
   */
 public static Integer recursiveMethod(Integer n){
   if (n == 0) return 0;
   if (n == 1) return 1;
   return recursiveMethod(n-2) + recursiveMethod(n-1);
 }
}
