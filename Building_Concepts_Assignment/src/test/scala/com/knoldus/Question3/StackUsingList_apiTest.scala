// Author - Nikhil Varghese

package com.knoldus.Question3

import org.scalatest.flatspec.AnyFlatSpec

class StackUsingList_apiTest extends AnyFlatSpec {

  "the push operation" should "be valid" in {
    val push = new StackUsingList_api()
    val actualResult = push.push(2)
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
  }

  "the push operation" should "not be valid" in {
    val push = new StackUsingList_api()
    val actualResult = push.push(1)
    val expectedResult = ""
    assert(actualResult != expectedResult)
  }

  "the pop operation" should "be valid when Stack is empty" in {
    val popElement = new StackUsingList_api()
    val actualResult = popElement.pop()
    val expectedResult = "Stack Underflow"
    assert(actualResult === expectedResult)
  }

  "the pop operation" should "be valid after pushing one element" in {
    val popElement = new StackUsingList_api()
    popElement.push(1)
    val actualResult = popElement.pop()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the pop operation" should "not be valid" in {
    val popElement = new StackUsingList_api()
    popElement.push(2)
    val actualResult = popElement.pop()
    val expectedResult = "Stack Underflow"
    assert(actualResult != expectedResult)
  }

  "the printStack operation" should "be valid" in {
    val printElement = new StackUsingList_api()
    printElement.push(1)
    printElement.push(2)
    printElement.push(3)
    val actualResult = printElement.printStack()
    val expectedResult = List(3, 2, 1)
    assert(actualResult === expectedResult)
  }

  "the printStack operation" should "not be valid" in {
    val printElement = new StackUsingList_api()
    printElement.push(1)
    printElement.push(2)
    val actualResult = printElement.printStack()
    val expectedResult = List(1, 2)
    assert(actualResult != expectedResult)
  }

  "the isEmpty operation" should "be valid" in {
    val empty = new StackUsingList_api()
    val actualResult = empty.isEmpty
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "the isEmpty operation" should "not be valid" in {
    val empty = new StackUsingList_api()
    empty.push(1)
    val actualResult = empty.isEmpty
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

  "the size operation" should "be valid" in {
    val sizeStack = new StackUsingList_api()
    sizeStack.push(1)
    sizeStack.push(0)
    sizeStack.push(3)
    val actualResult = sizeStack.size
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }

  "the size operation" should "not be valid" in {
    val sizeStack = new StackUsingList_api()
    val actualResult = sizeStack.size
    val expectedResult = 1
    assert(actualResult != expectedResult)
  }

  "the peek operation" should "be valid" in {
    val peekElement = new StackUsingList_api()
    peekElement.push(0)
    peekElement.push(3)
    peekElement.push(1)
    val actualResult = peekElement.peek
    val expectedResult = 1
    assert(actualResult === expectedResult)
  }


  "the peek operation" should "not be valid" in {
    val peekElement = new QueueUsingList_api()
    val actualResult = peekElement.peek
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

}
