// Author - Nikhil Varghese

package com.knoldus.Question2

import scala.io.StdIn.readInt

object Table_impl {
  def main(args: Array[String]): Unit = {
    val Table = new Table_api()
    try {
      print("\nEnter Total Elements: ")
      val totalElements = readInt()
      print("\nEnter Elements in List:\n")
      val inputList = List.fill(totalElements) {
        readInt()
      }
      Table.table(inputList)
    }
    catch {
      case numberFormatException:NumberFormatException => print("Enter a Number.")
    }


  }

}
