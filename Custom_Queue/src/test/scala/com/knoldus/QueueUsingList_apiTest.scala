// Author - Nikhil Varghese

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec


class QueueUsingList_apiTest extends AnyFlatSpec {

  "The Enqueue Operation in Queue of type Int" should "be valid when inserting single element" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(1)
    val actualResult = insertedElement.printQueue()
    val expectedResult = List(1)
    assert(actualResult === expectedResult)
  }

  "The Enqueue Operation  in Queue of type Int" should "be valid when list of elements is inserted " in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List(1,2,3)
    assert(actualResult === expectedResult)
  }

  "The Enqueue Operation in Queue of type Int" should "not be valid when list of elements is inserted " in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List(3,2,1)
    assert(actualResult != expectedResult)
  }

  "The Dequeue Operation in Queue of type Int" should "be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val afterDequeue = insertedElement.dequeue
    val actualResult = afterDequeue.printQueue()
    val expectedResult = List(2,3)
    assert(actualResult === expectedResult)
  }

  "The Dequeue Operation in Queue of type Int" should "not be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val afterDequeue = insertedElement.dequeue
    val actualResult = afterDequeue.printQueue()
    val expectedResult = List(1,2)
    assert(actualResult != expectedResult)
  }

  "The printQueue Operation in Queue of type Int" should "be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List(1,2,3)
    assert(actualResult === expectedResult)
  }

  "The printQueue Operation in Queue of type Int" should "not be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List()
    assert(actualResult != expectedResult)
  }

  "The Peek Operation in Queue of type Int" should "be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.peek()
    val expectedResult = 1
    assert(actualResult === expectedResult)
  }

  "The Peek Operation in Queue of type Int" should "not be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.peek()
    val expectedResult = 3
    assert(actualResult != expectedResult)
  }

  "The isEmpty Operation in Queue of type Int" should "be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val actualResult = queue.isEmpty()
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "The isEmpty Operation in Queue of type Int" should "not be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(1)
    val actualResult = insertedElement.isEmpty()
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

  "The Size Operation in Queue of type Int" should "be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.size()
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }


  "The Size Operation in Queue of type Int" should "not be valid" in {
    val queue = new QueueUsingList_api[Int](List())
    val insertedElement = queue.enqueue(List(1,2,3))
    val actualResult = insertedElement.size()
    val expectedResult = 2
    assert(actualResult != expectedResult)
  }


  "The Enqueue Operation in Queue of type String" should "be valid when inserting single element" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue("abc")
    val actualResult = insertedElement.printQueue()
    val expectedResult = List("abc")
    assert(actualResult === expectedResult)
  }


  "The Enqueue Operation  in Queue of type String" should "be valid when list of elements is inserted " in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List("CR7","Chelsea","Nikhil")
    assert(actualResult === expectedResult)
  }

  "The Enqueue Operation in Queue of type String" should "not be valid when list of elements is inserted " in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List("Nikhil","Chelsea","CR7")
    assert(actualResult != expectedResult)
  }

  "The Dequeue Operation in Queue of type String" should "be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val afterDequeue = insertedElement.dequeue
    val actualResult = afterDequeue.printQueue()
    val expectedResult = List("Chelsea","Nikhil")
    assert(actualResult === expectedResult)
  }

  "The Dequeue Operation in Queue of type String" should "not be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val afterDequeue = insertedElement.dequeue
    val actualResult = afterDequeue.printQueue()
    val expectedResult = List("CR7","Chelsea")
    assert(actualResult != expectedResult)
  }

  "The printQueue Operation in Queue of type String" should "be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List("CR7","Chelsea","Nikhil")
    assert(actualResult === expectedResult)
  }

  "The printQueue Operation in Queue of type String" should "not be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.printQueue()
    val expectedResult = List()
    assert(actualResult != expectedResult)
  }

  "The Peek Operation in Queue of type String" should "be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.peek()
    val expectedResult = "CR7"
    assert(actualResult === expectedResult)
  }

  "The Peek Operation in Queue of type String" should "not be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.peek()
    val expectedResult = "Nikhil"
    assert(actualResult != expectedResult)
  }

  "The isEmpty Operation in Queue of type String" should "be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val actualResult = queue.isEmpty()
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "The isEmpty Operation in Queue of type String" should "not be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue("Chelsea")
    val actualResult = insertedElement.isEmpty()
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

  "The Size Operation in Queue of type String" should "be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.size()
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }

  "The Size Operation in Queue of type String" should "not be valid" in {
    val queue = new QueueUsingList_api[String](List())
    val insertedElement = queue.enqueue(List("CR7","Chelsea","Nikhil"))
    val actualResult = insertedElement.size()
    val expectedResult = 2
    assert(actualResult != expectedResult)
  }

}
