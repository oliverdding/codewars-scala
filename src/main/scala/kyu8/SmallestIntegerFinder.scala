package com.github.oliverdding.codewars
package kyu8

/** 55a2d7ebe362935a210000b2
  */
object SmallestIntegerFinder {
  def findSmallestInt(nums: List[Int]): Int =
    if (nums.isEmpty) throw new java.util.NoSuchElementException else nums.min
}
