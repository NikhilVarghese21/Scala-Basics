// Author - Nikhil Varghese

package com.knoldus.Question3

class QueueUsingList_api {

  var list: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1

  //inserts an element(rear) into Queue
  def enqueue(element:Any): String = {
    if (front== -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      list = list ::: List(element)
    }
    else{
      rear = rear + 1
      list = list ::: List(element)
    }
    "Element has been Inserted."
  }

  //deletes an element(front) from the Queue.
  def dequeue(): String = {
    if (front== -1 && rear == -1){
      "Queue is empty."
    }
    else if(front == rear){
      list = list.drop(1)
      front = -1
      rear = -1
      "Element has been deleted."
    }
    else{
      list = list.drop(1)
      front = front + 1
      "Element has been deleted."
    }
  }

  //returns elements of Queue.
  def printQueue():List[Any] = {
    //list.foreach((element:Any) => print(element + " "))
    val values = for(element <- list) yield element
    values
  }


  //returns the front element of Queue
  def peek: Any = {
    if (front >= 0){
      list(front)
    }
    else {
      "Queue Underflow."
    }
  }

  //checks whether the Queue is empty or not.
  def isEmpty:Boolean = {
    if (front == -1 || rear == -1) {
      true
    }
    else {
      false
    }
  }

}
