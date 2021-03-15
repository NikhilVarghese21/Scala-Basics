// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {

  "the comparison" should "be valid when both Person's name are same but Person1's age is greater than Person2" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne > personTwo
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  "the comparison" should "not be valid when both Person's name are same but Person1's age is greater than Person2" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne > personTwo
    val expectedResult = true
    assert(actualResult != expectedResult)
  }


  "the comparison" should "be valid when both Person's name are same but Person1's age is smaller than Person2" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne < personTwo
    val expectedResult = true
    assert(actualResult === expectedResult)
  }


  "the comparison" should "not be valid when both Person's name are same but Person1's age is smaller than Person2" in {
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne < personTwo
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  "the comparison" should "be valid when both Person's name are different and length of Person1's name is greater than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne >= personTwo
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "the comparison" should "not be valid when both Person's name are different and length of Person1's name is greater than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne >= personTwo
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  "the comparison" should "be valid when both Person's name are different and length of Person1's name is smaller than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne <= personTwo
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  "the comparison" should "not be valid when both Person's name are different and length of Person1's name is smaller than Person2" in {
    val personOne = new Person("TestAgain", 1)
    val personTwo = new Person("Test", 3)
    val actualResult = personOne <= personTwo
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

}
