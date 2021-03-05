// Author - Nikhil Varghese

package com.knoldus

import scala.annotation.tailrec

class InsertionSort_api {

  def insertSort(list: List[Int]): List[Int] = {
    @tailrec
    def insert(element: Int, sortedList: List[Int], accumulator: List[Int]): List[Int] = { //accumulator stores values smaller than element.
      /*
      insert(4, [1,2,3,5], []) -----> else is executed.
      insert(4, [2,3,5], [1]) -----> else is executed.
      insert(4, [3,5], [2,1]) -----> else is executed.
      insert(4, [5], [3,2,1]) -----> if is executed.
      [3,2,1].reverse ++ (4 :: [5]) ----->
      [1,2,3,4,5]
       */
      if (sortedList.isEmpty || element <= sortedList.head) {
        accumulator.reverse ++ (element :: sortedList)
      }
      else {
        insert(element, sortedList.tail, sortedList.head :: accumulator)
      }
    }

    @tailrec
    def sort(list: List[Int], accumulator: List[Int]): List[Int] =
      if (list.isEmpty) {
        accumulator //returning accumulator which contains sorted elements when list is empty.
      }
      else
      {
        sort(list.tail, insert(list.head, accumulator, Nil)) //inserting head value in correct position in accumulator.
      }
    sort(list, Nil)
  }

  /*
  def insertSort(list: List[Int]): List[Int] = {

  //adds an element into an already-sorted list and returns a new sorted list.
    def insert(element: Int, sortedList: List[Int]): List[Int] =
      if (sortedList.isEmpty || element <= sortedList.head) {
        element :: sortedList
      }
      else {
        sortedList.head :: insert(element, sortedList.tail)
      }

    //returning the same list if the list to be sorted is empty or has a single element.
    if (list.isEmpty || list.tail.isEmpty) {
      list
    }
    else {
        insert(list.head, insertSort(list.tail))
      }
  }
*/

}

