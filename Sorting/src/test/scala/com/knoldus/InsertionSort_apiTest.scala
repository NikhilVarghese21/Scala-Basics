// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class InsertionSort_apiTest extends AnyFlatSpec {

  "the reverse of list" should "be valid" in {
    val reverse = new InsertionSort_api()
    val actualResult = reverse.insertSort(List(3,2,2,1,0))
    val expectedResult = List(0,1,2,2,3)
    assert(actualResult === expectedResult)
  }

  "the reverse of list" should "not be valid" in {
    val reverse = new InsertionSort_api()
    val actualResult = reverse.insertSort(List(3,1,2,2,0))
    val expectedResult = List(0,1,2,3)
    assert(actualResult != expectedResult)
  }

}

