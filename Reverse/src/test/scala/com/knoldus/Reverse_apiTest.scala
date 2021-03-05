// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Reverse_apiTest extends AnyFlatSpec {

  val actualNumber = 9826
  val expectedNumber = 6289
  val errorNumber = 6298

  "the reverse of string" should "be valid" in {
    val reverse = new Reverse_api()
    val actualResult = reverse.reverseString("Nikhil Varghese")
    val expectedResult = "esehgraV lihkiN"
    assert(actualResult === expectedResult)
  }

  "the reverse of string" should "not be valid" in {
    val reverse = new Reverse_api()
    val actualResult = reverse.reverseString("Nikhil Varghese")
    val expectedResult = "esehgrav lihkin"
    assert(actualResult != expectedResult)
  }

  "the reverse of number" should "be valid" in {
    val reverse = new Reverse_api()
    val actualResult = reverse.reverseNumber(actualNumber)
    val expectedResult = expectedNumber
    assert(actualResult === expectedResult)
  }

  "the reverse of number" should "not be valid" in {
    val reverse = new Reverse_api()
    val actualResult = reverse.reverseNumber(actualNumber)
    val expectedResult = errorNumber
    assert(actualResult != expectedResult)
  }

  "the reverse of list" should "be valid" in {
    val reverse = new Reverse_api()
    val actualResult = reverse.reverseList(List(3,2,1,0))
    val expectedResult = List(0,1,2,3)
    assert(actualResult === expectedResult)
  }

  "the reverse of list" should "not be valid" in {
    val reverse = new Reverse_api()
    val actualResult = reverse.reverseList(List(3,1,2,0))
    val expectedResult = List(3,1,2,0)
    assert(actualResult != expectedResult)
  }
}
