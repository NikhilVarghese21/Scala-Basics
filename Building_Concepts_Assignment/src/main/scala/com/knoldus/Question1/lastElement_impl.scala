// Author - Nikhil Varghese

package com.knoldus.Question1

import scala.io.StdIn.{ readInt, readLine}

object lastElement_impl {

  def main(args: Array[String]): Unit = {
    val last = new lastElement_api()
    try {
      print("Enter total Elements: ")
      val total = readInt()
      print("\nEnter Elements in List: \n")
      val inputList = List.fill(total) {
        readLine()
      }

      print("\nLast Element is " + last.getLastElement(inputList))
    }
    catch {
      case numberFormatException: NumberFormatException => print("Enter a Number.")
    }
  }

}
