// Author - Nikhil Varghese

package com.knoldus

import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Reverse_impl {
  def main(args: Array[String]): Unit =
  {
    val reverse_api = new Reverse_api()
    try {
      print("Enter String to Reverse: ")
      val str = readLine()
      print(s"Reverse of $str is: " + reverse_api.reverseString(str))
    }
    catch {
      case x:Throwable => print("Not a String.")
    }

    try {
      print("\nEnter total elements to be inserted in List: ")
      val totalElements = readInt()
      print(s"Enter $totalElements elements:\n")
      val inputList = List.fill(totalElements) {
        readInt()
      }
      print("Reverse of " + inputList + " is:  " + reverse_api.reverseList(inputList))
    }
    catch {
      case nfe:NumberFormatException => print("Not a Number.")
    }

    try {
      print("\nEnter Number to Reverse: ")
      val number = readInt()
      print(s"Reverse of $number is: " + reverse_api.reverseNumber(number))
    }
    catch {
      case nfe:NumberFormatException => print("Not a Number.")
    }
  }
}
