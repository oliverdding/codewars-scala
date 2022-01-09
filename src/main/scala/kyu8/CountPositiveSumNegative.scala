package com.github.oliverdding.codewars
package kyu8

/** 576bb71bbbcf0951d5000044
  */
object CountPositiveSumNegative {
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    if (integers == null && integers.isEmpty) {
      return (0, 0)
    }
    (integers.count(_ > 0), integers.filter(_ < 0).sum)
  }
}
