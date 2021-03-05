// Author - Nikhil Varghese

package com.knoldus

import scala.io.StdIn.readInt

object InsertionSort_impl {

  def main(args: Array[String]): Unit = {
    val sort = new InsertionSort_api()
    try {
      print("\nEnter total elements to be inserted in List: ")
      val totalElements = readInt()
      print(s"Enter $totalElements elements:\n")
      val unsortedList = List.fill(totalElements) {
        readInt()
      }
      print(s"After Insertion Sort, the Unsorted $unsortedList becomes " + sort.insertSort(unsortedList))
    }
    catch {
      case n:NumberFormatException => print("Not a Number.")
    }
  }

}
