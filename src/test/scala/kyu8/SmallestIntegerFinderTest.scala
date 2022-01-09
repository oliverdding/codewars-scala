package com.github.oliverdding.codewars
package kyu8

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SmallestIntegerFinderTest extends AnyFunSuite with Matchers {

  test("Minimum element of List(42)") {
    SmallestIntegerFinder.findSmallestInt(List(42)) shouldBe 42
  }

  test("Minimum element of List(-7, 42)") {
    SmallestIntegerFinder.findSmallestInt(List(-7, 42)) shouldBe -7
  }

  test("Minimum element of List(78,56,232,12,8)") {

    SmallestIntegerFinder.findSmallestInt(List(78, 56, 232, 12, 8)) shouldBe 8

  }
}
