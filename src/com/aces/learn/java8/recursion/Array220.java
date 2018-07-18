package com.aces.learn.java8.recursion;


/**
 *
 */
public class Array220 {
 public static void main (String[] args){
   System.out.println(recursiveMethod(new int []{1,2,20}, 0));
 }

  /**
   Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
   We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call
   can pass index+1 to move down the array. The initial call will pass in index as 0.

   array220([1, 2, 20], 0) → true
   array220([3, 30], 0) → true
   array220([3], 0) → false
   */
  public static boolean recursiveMethod(int[] arr, int index) {
    if (arr.length<=1) return false;
    if (index+1==arr.length) return false;
    if (arr[index+1] == arr[index]*10) return true;
    return recursiveMethod (arr, index+1);
  }
}
