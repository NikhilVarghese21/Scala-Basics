// Author - Nikhil Varghese

package com.knoldus

trait Queue {
  var list: List[Int] = List()
  var front: Int = -1
  var rear: Int = -1

  def enqueue(element:Int): String

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


  //returns elements of Queue in List.
  def printQueue():List[Int] = {
    val values = for(element <- list) yield element
    values
  }

}
