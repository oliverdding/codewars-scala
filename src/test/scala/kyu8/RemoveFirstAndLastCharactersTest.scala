package com.github.oliverdding.codewars
package kyu8

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class RemoveFirstAndLastCharactersTest
    extends AnyFunSuite
    with TableDrivenPropertyChecks
    with Matchers {

  import RemoveFirstAndLastCharacters.removeChars

  val fixedTests = Table[String, String](
    ("s", "expected"),
    ("eloquent", "loquen"),
    ("country", "ountr"),
    ("person", "erso"),
    ("place", "lac")
  )

  test("Fixed tests") { forAll(fixedTests) { removeChars(_) shouldBe _ } }

}
