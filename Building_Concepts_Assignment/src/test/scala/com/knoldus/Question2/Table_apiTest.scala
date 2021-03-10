// Author - Nikhil Varghese

package com.knoldus.Question2

import org.scalatest.flatspec.AnyFlatSpec

class Table_apiTest extends AnyFlatSpec {

  "The Table" should "be valid" in {
    val Table = new Table_api()
    val actualResult = Table.table(List(1,2,3))
    val expectedResult = true
    assert(actualResult === expectedResult)
  }


  "The Table" should "not be valid" in {
    val Table = new Table_api()
    val actualResult = Table.table(List())
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

}
