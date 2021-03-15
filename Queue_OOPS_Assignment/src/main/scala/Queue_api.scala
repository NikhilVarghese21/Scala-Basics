// Author - Nikhil Varghese

import com.knoldus.Queue

package com.knoldus.doubleQueue {

  class DoubleQueue extends Queue {
    //Inserts elements in Queue after doubling the elements.
    def enqueue(element: Int): String = {
      if (front == -1 && rear == -1) {
        front = front + 1
        rear = rear + 1
        list = list ::: List(2 * element)
      }
      else {
        rear = rear + 1
        list = list ::: List(2 * element)
      }
      "Element has been Inserted."
    }

  }

}

package com.knoldus.squareQueue {

  class SquareQueue extends Queue {
    //Inserts elements in Queue after squaring the elements.
    def enqueue(element: Int): String = {
      if (front == -1 && rear == -1) {
        front = front + 1
        rear = rear + 1
        list = list ::: List(element * element)
      }
      else {
        rear = rear + 1
        list = list ::: List(element * element)
      }
      "Element has been Inserted."
    }

  }

}

