// Author - Nikhil Varghese

package com.knoldus.Question3

import scala.io.StdIn.{readInt, readLine}

object QueueUsingList_impl {

  def main(args: Array[String]): Unit = {
    val queue = new QueueUsingList_api()
    val (enqueue, dequeue, printQueue, peek, isEmpty) = (1, 2, 3, 4, 5)
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("\nQUEUE\n")
        print("1. Enqueue\n")
        print("2. Dequeue\n")
        print("3. PrintQueue\n")
        print("4. Peek\n")
        print("5. isEmpty\n")
        print("Choose an Option (1 - 4) : ")
        val option = readInt()
        option match {
          case `enqueue` => print("Enter element to Enqueue: ")
                           val num = readInt()
                           print(queue.enqueue(num))
          case `dequeue` => print(queue.dequeue())
          case `printQueue` => val result = queue.printQueue()
                               if (result.isEmpty) print("Queue Underflow.") else result.foreach(element => print(element + " "))
          case `peek` => val value = queue.peek
                         if (value.equals("Queue Underflow.")) print("Queue Underflow.") else print("The front element is: " + value)
          case `isEmpty` => print("Queue Empty: " + queue.isEmpty)
          case _ => print("Enter a valid option")
        }
      }
      catch {
        case numberFormatException: NumberFormatException => print("Enter a valid option.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }

  }

}
