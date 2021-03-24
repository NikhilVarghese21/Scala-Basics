// Author - Nikhil Varghese

package com.knoldus

object QueueUsingList_impl extends App {

  //Operations on Queue of Integers.
  print("QUEUE OF INTEGERS: \n")
  val queue = new QueueUsingList_api[Int](List())
  val elementOne = queue.enqueue(1)
  val elementTwo = elementOne.enqueue(2)
  val elementThree = elementTwo.enqueue(3)
  print("Front Element is: " + elementThree.peek())
  val elementFour = elementThree.dequeue
  print("\nElements of List are: " + elementFour.printQueue())
  print("\nList Empty: " + elementFour.isEmpty())
  val elementFive = elementFour.enqueue(List(3,2,3,1))
  print("\nAfter Entering List of Elements: " + elementFive.printQueue())
  print("\nSize of Queue is: " + elementFive.size())

  //Operations on Queue of String.
  print("\n\nQUEUE OF STRING: \n")
  val queueString = new QueueUsingList_api[String](List())
  val stringElementOne = queueString.enqueue("abc")
  val stringElementTwo = stringElementOne.enqueue("pqr")
  val stringElementThree = stringElementTwo.enqueue("xyz")
  print("Front Element is: " + stringElementThree.peek())
  val stringElementFour = stringElementThree.dequeue
  print("\nElements of List are: " + stringElementFour.printQueue())
  print("\nList Empty: " + stringElementFour.isEmpty())
  val stringElementFive = stringElementFour.enqueue(List("CR7","Chelsea","Nikhil"))
  print("\nAfter Entering List of Elements: " + stringElementFive.printQueue())
  print("\nSize of Queue is: " + stringElementFive.size())


}
