// Author - Nikhil Varghese

package com.knoldus

import scala.annotation.tailrec

class Reverse_api {

  def reverseString(str: String): String = {
    // applying tail recursion for reversing the string
    @tailrec
    def reverse(str: String, rev: String): String = {

      str match {
        case "" => rev //return rev when str is empty
        case string => reverse(string.tail, string.head + rev) //head value is concatenated to rev and calling reverse function recursively with tail.
      }
    }
    reverse(str,"")
  }

  /*
  def reverseString(str: String) : String = {
    (for(counter <- str.length - 1 to 0 by -1) yield str(counter)).mkString
  }
  */


  def reverseNumber(number: Int): Int = {
    val num = number.toString
    val rev_num = reverseString(num) //calling reverseString function
    rev_num.toInt
  }


  def reverseList(inputList:List[Int]):List[Int] = {
    @tailrec
    def revList(originalList: List[Int], reverseList: List[Int]): List[Int] = { originalList match {
        case Nil => reverseList //returning reverseList when originalList is empty.
        case head::tail => revList(tail , head :: reverseList) //head value is prepended to reverseList and calling revList function recursively with tail.`
    }
    }
    revList(inputList, Nil)
  }

  /*
  def reverseList(input: List[Int]): List[Int] = {
    input.foldLeft(List[Int]())((accumulator,current_value) => current_value::accumulator)
  }
  */

}
