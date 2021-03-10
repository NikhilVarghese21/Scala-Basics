// Author - Nikhil Varghese

package com.knoldus.Question3

class StackUsingList_api {

  var list: List[Any] = List.empty
  var top: Int = -1

  //inserts an element into the stack
  def push(element:Any):String = {
    top = top + 1
    list = list ::: List(element)
    "Element has been Inserted."
  }

  //deletes an element from the stack
  def pop(): String = {
    if (top == -1) {
      "Stack Underflow"
    }
    else {
      list = list.dropRight(1)
      top = top - 1
      "Element has been deleted."
    }
  }

  //returns the elements of stack in reverse order.
  def printStack():List[Any] = {
    val values = for(element <- list) yield element
    values.reverse
  }

  //checks whether stack is empty or not.
  def isEmpty:Boolean = {
    if (top == -1) {
      true
    }
    else {
      false
    }
  }

  // returns the size of the stack
  def size:Int = list.length

  // returns the top element of stack.
  def peek: Any = {
    if (top >= 0) {
      list(top)
    }
    else {
      top
    }
  }

}
