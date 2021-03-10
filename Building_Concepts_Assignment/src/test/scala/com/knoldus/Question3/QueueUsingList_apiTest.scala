// Author - Nikhil Varghese

package com.knoldus.Question3

import org.scalatest.flatspec.AnyFlatSpec

class QueueUsingList_apiTest extends AnyFlatSpec {

  "the enqueue operation" should "be valid" in {
    val enqueueElement = new QueueUsingList_api()
    val actualResult = enqueueElement.enqueue(2)
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
  }

  "the enqueue operation" should "not be valid" in {
    val enqueueElement = new QueueUsingList_api()
    val actualResult = enqueueElement.enqueue(1)
    val expectedResult = ""
    assert(actualResult != expectedResult)
  }

  "the dequeue operation" should "be valid when Stack is empty" in {
    val dequeueElement = new QueueUsingList_api()
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  "the dequeue operation" should "be valid after pushing one element" in {
    val dequeueElement = new QueueUsingList_api()
    dequeueElement.enqueue(1)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the dequeue operation" should "be valid after pushing few elements" in {
    val dequeueElement = new QueueUsingList_api()
    dequeueElement.enqueue(1)
    dequeueElement.enqueue(1)
    dequeueElement.enqueue(1)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the dequeue operation" should "not be valid" in {
    val dequeueElement = new QueueUsingList_api()
    dequeueElement.enqueue(2)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult != expectedResult)
  }

  "the printQueue operation" should "be valid" in {
    val printElement = new QueueUsingList_api()
    printElement.enqueue(1)
    printElement.enqueue(2)
    printElement.enqueue(3)
    val actualResult = printElement.printQueue()
    val expectedResult = List(1, 2, 3)
    assert(actualResult === expectedResult)
  }

  "the printQueue operation" should "not be valid" in {
    val printElement = new QueueUsingList_api()
    printElement.enqueue(1)
    printElement.enqueue(2)
    val actualResult = printElement.printQueue()
    val expectedResult = List(2, 1)
    assert(actualResult != expectedResult)
  }

  "the isEmpty operation" should "be valid" in {
    val empty = new QueueUsingList_api()
    val actualResult = empty.isEmpty
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "the isEmpty operation" should "not be valid" in {
    val empty = new QueueUsingList_api()
    empty.enqueue(1)
    val actualResult = empty.isEmpty
    val expectedResult = true
    assert(actualResult != expectedResult)
  }


  "the peek operation" should "be valid" in {
    val peekElement = new QueueUsingList_api()
    peekElement.enqueue(0)
    peekElement.enqueue(3)
    peekElement.enqueue(1)
    val actualResult = peekElement.peek
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }


  "the peek operation" should "not be valid" in {
    val peekElement = new QueueUsingList_api()
    val actualResult = peekElement.peek
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }


}
