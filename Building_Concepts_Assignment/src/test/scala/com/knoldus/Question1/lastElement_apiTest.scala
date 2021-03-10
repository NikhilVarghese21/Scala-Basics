// Author - Nikhil Varghese

package com.knoldus.Question1

import org.scalatest.flatspec.AnyFlatSpec

class lastElement_apiTest extends AnyFlatSpec {

  val inputListInt = List(1,2,3,1,2,0,1)
  val inputListString = List("abc", "lmn", "pqr", "xyz")
  val inputListAny = List(1,"nikhil",12.0, -1,'t', true)

  "the last element" should "be valid when values are of type Int" in {
    val last = new lastElement_api()
    val actualResult = last.getLastElement(inputListInt)
    val expectedResult = 1
    assert(actualResult === expectedResult)
  }

  "the last element" should "not be valid when values are of type Int" in {
    val last = new lastElement_api()
    val actualResult = last.getLastElement(inputListInt)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  "the last element" should "be valid when values are of type String" in {
    val last = new lastElement_api()
    val actualResult = last.getLastElement(inputListString)
    val expectedResult = "xyz"
    assert(actualResult === expectedResult)
  }


  "the last element" should "not be valid when values are of type String" in {
    val last = new lastElement_api()
    val actualResult = last.getLastElement(inputListString)
    val expectedResult = "abc"
    assert(actualResult != expectedResult)
  }


  "the last element" should "be valid when values are of type Any" in {
    val last = new lastElement_api()
    val actualResult = last.getLastElement(inputListAny)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "the last element" should "not be valid when values are of type Any" in {
    val last = new lastElement_api()
    val actualResult = last.getLastElement(inputListAny)
    val expectedResult = -1
    assert(actualResult != expectedResult)
  }

}
