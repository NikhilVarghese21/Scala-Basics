// Author - Nikhil Varghese

package com.knoldus.Question1

class lastElement_api {

  //returns the length of the List
  def findLength[A](l:List[A]):Int = l match {
    case Nil => 0
    case h::tail => 1 + findLength(tail)
  }

  //returns the last element of the inputList
  def getLastElement[A](inputList: List[A]):A= {
    var index = findLength(inputList) - 1
    //inputList.apply(index)
    val value = inputList(index)
    value
  }
}
