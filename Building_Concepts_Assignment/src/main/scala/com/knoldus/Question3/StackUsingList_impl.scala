// Author - Nikhil Varghese

package com.knoldus.Question3

import scala.io.StdIn.{readInt, readLine}

object StackUsingList_impl {

  def main(args: Array[String]): Unit = {
    val stack = new StackUsingList_api()
    val (push, pop, printStack, size, peek, isEmpty) = (1, 2, 3, 4, 5, 6)
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("\nSTACK\n")
        print("1. Push\n")
        print("2. Pop\n")
        print("3. PrintStack\n")
        print("4. Size\n")
        print("5. Peek\n")
        print("6. isEmpty\n")
        print("Choose an Option (1 - 6) : ")
        val option = readInt()
        option match {
          case `push` => print("Enter element to Push: ")
                         val num = readInt()
                         print(stack.push(num))
          case `pop` => print(stack.pop())
          case `printStack` => val result = stack.printStack()
                               if (result.isEmpty) print("Stack Underflow") else result.foreach(element => print(element + " "))
          case `size` => print("The size of Stack is: " + stack.size)
          case `peek` => val value = stack.peek
                          if (value == -1) print("Stack Underflow.") else print("The Top element of Stack is: " + value)
          case `isEmpty` => print("Stack Empty: " + stack.isEmpty)
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

