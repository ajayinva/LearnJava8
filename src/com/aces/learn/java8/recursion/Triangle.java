package com.aces.learn.java8.recursion;


/**
 *
 */
public class Triangle {
 public static void main (String[] args){
   System.out.println(recursiveMethod(4));
 }

  /**
   We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
   the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
   the total number of blocks in such a triangle with the given number of rows.
   triangle(0) → 0
   triangle(1) → 1
   triangle(2) → 3
   triangle(3) → 6
   triangle(4) → 10
   */
  public static int recursiveMethod(int blocks) {
    if (blocks == 0) return 0;
    return blocks + recursiveMethod(blocks-1);
  }
}
