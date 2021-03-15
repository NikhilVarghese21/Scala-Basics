// Author - Nikhil Varghese

package com.knoldus

import com.knoldus.doubleQueue.DoubleQueue
import com.knoldus.squareQueue.SquareQueue
import org.scalatest.flatspec.AnyFlatSpec

class Queue_apiTest extends AnyFlatSpec {

  //DOUBLE QUEUE TESTS

  "the enqueue operation in DoubleQueue" should "be valid" in {
    val enqueueElement = new DoubleQueue()
    val actualResult = enqueueElement.enqueue(2)
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
  }

  "the enqueue operation in DoubleQueue" should "not be valid" in {
    val enqueueElement = new DoubleQueue()
    val actualResult = enqueueElement.enqueue(1)
    val expectedResult = ""
    assert(actualResult != expectedResult)
  }

  "the dequeue operation in DoubleQueue" should "be valid when Queue is empty" in {
    val dequeueElement = new DoubleQueue()
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  "the dequeue operation in DoubleQueue" should "be valid after pushing one element" in {
    val dequeueElement = new DoubleQueue()
    dequeueElement.enqueue(1)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the dequeue operation  in DoubleQueue" should "be valid after pushing few elements" in {
    val dequeueElement = new DoubleQueue()
    dequeueElement.enqueue(1)
    dequeueElement.enqueue(1)
    dequeueElement.enqueue(1)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the dequeue operation  in DoubleQueue" should "not be valid" in {
    val dequeueElement = new DoubleQueue()
    dequeueElement.enqueue(2)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult != expectedResult)
  }

  "the printQueue operation  in DoubleQueue" should "be valid" in {
    val (doubleOne, doubleTwo, doubleThree) = (2, 4, 6)
    val printElement = new DoubleQueue()
    printElement.enqueue(1)
    printElement.enqueue(2)
    printElement.enqueue(3)
    val actualResult = printElement.printQueue()
    val expectedResult = List(doubleOne, doubleTwo, doubleThree)
    assert(actualResult === expectedResult)
  }

  "the printQueue operation  in DoubleQueue" should "not be valid" in {
    val printElement = new DoubleQueue()
    printElement.enqueue(1)
    printElement.enqueue(2)
    val actualResult = printElement.printQueue()
    val expectedResult = List(2, 1)
    assert(actualResult != expectedResult)
  }

  //SQUARE QUEUE TESTS

  "the enqueue operation in SquareQueue" should "be valid" in {
    val enqueueElement = new SquareQueue()
    val actualResult = enqueueElement.enqueue(2)
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
  }

  "the enqueue operation in SquareQueue" should "not be valid" in {
    val enqueueElement = new SquareQueue()
    val actualResult = enqueueElement.enqueue(1)
    val expectedResult = ""
    assert(actualResult != expectedResult)
  }

  "the dequeue operation in SquareQueue" should "be valid when Queue is empty" in {
    val dequeueElement = new SquareQueue()
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  "the dequeue operation in SquareQueue" should "be valid after pushing one element" in {
    val dequeueElement = new SquareQueue()
    dequeueElement.enqueue(1)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the dequeue operation  in SquareQueue" should "be valid after pushing few elements" in {
    val dequeueElement = new SquareQueue()
    dequeueElement.enqueue(1)
    dequeueElement.enqueue(1)
    dequeueElement.enqueue(1)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }


  "the dequeue operation  in SquareQueue" should "not be valid" in {
    val dequeueElement = new SquareQueue()
    dequeueElement.enqueue(2)
    val actualResult = dequeueElement.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult != expectedResult)
  }

  "the printQueue operation  in SquareQueue" should "be valid" in {
    val (squareOne, squareTwo, squareThree) = (1, 4, 9)
    val printElement = new SquareQueue()
    printElement.enqueue(1)
    printElement.enqueue(2)
    printElement.enqueue(3)
    val actualResult = printElement.printQueue()
    val expectedResult = List(squareOne, squareTwo, squareThree)
    assert(actualResult === expectedResult)
  }

  "the printQueue operation  in SquareQueue" should "not be valid" in {
    val printElement = new SquareQueue()
    printElement.enqueue(1)
    printElement.enqueue(2)
    val actualResult = printElement.printQueue()
    val expectedResult = List(2, 1)
    assert(actualResult != expectedResult)
  }


}
