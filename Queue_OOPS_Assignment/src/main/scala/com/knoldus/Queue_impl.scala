// Author - Nikhil Varghese

package com.knoldus

import com.knoldus.doubleQueue.DoubleQueue
import com.knoldus.squareQueue.SquareQueue

object Queue_impl {

  def main(args: Array[String]): Unit = {
    //Double Queue Operations
    val doubleQueue = new DoubleQueue()
    doubleQueue.enqueue(1)
    doubleQueue.enqueue(2)
    doubleQueue.enqueue(3)
    doubleQueue.dequeue()
    print("Double Queue Elements are: " + doubleQueue.printQueue())

    //Square Queue Operations
    val squareQueue = new SquareQueue()
    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.dequeue()
    print("\nSquare Queue Elements are: " + squareQueue.printQueue())
  }

}
