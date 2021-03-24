// Author - Nikhil Varghese

package com.knoldus

class QueueUsingList_api[+A](list: List[A]) {

  //Inserting List of Elements in Queue.
  def enqueue[B >: A](inputList:List[B]): QueueUsingList_api[B] = {
    inputList match {
      case head :: Nil => enqueue(inputList.head)
      case head :: tail => enqueue(inputList.head) enqueue(inputList.tail)
      case _ => new QueueUsingList_api(list)
    }
  }

  //Inserting a single element in Queue.
  def enqueue[B >: A](element:B): QueueUsingList_api[B] = new QueueUsingList_api(list :+ element)

  //Deleting an Element from Queue.
  def dequeue: QueueUsingList_api[A] = {
    if (list.isEmpty) {
      new QueueUsingList_api[A](list)
    }
    else{
      new QueueUsingList_api[A](list.tail)
    }
  }

  //Returns the Queue.
  def printQueue(): List[A] = {
    list
  }

  //Returns the front element of Queue.
  def peek() : A = {
    list.head
  }

  //Checks if Queue is empty or not.
  def isEmpty() : Boolean = {
    list.isEmpty
  }

  //Returns the size of Queue.
  def size(): Int = {
    list.length
  }

}
