// Author - Nikhil Varghese

package com.knoldus.Question2

class Table_api {


  //prints table of each element in List.
  def table(inputList : List[Int]):Boolean = {
    if (inputList.isEmpty) {
      false
    }
    else {
      for (element <- inputList) {
        print("\nTable of " + element + "\n")
        for (number <- 1 to 10) {
          print(element + " X " + number + " = " + (number * element) + "\n")
        }
        print(" ")
      }
      true
    }
  }


/*
  def table(inputList: List[Int]): List[List[Int]] = {
    val finalOutput = for (element <- inputList) yield {
    val eachElementOutput = for (multiplier <- 1 to 10) yield element * multiplier
    eachElementOutput.toList }
    finalOutput }
*/

}
