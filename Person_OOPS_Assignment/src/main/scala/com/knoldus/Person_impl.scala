// Author - Nikhil Varghese

package com.knoldus

object Person_impl {

  def main(args: Array[String]): Unit = {

    //comparing the age when names are same
    val personOne = new Person("Test", 1)
    val personTwo = new Person("Test", 3)
    print("personOne('Test' , 1) < personTwo('Test' , 3) : " + (personOne < personTwo) + "\n")
    print("personOne('Test' , 1) > personTwo('Test' , 3) : " + (personOne > personTwo) + "\n")

    //comparing the length of names when names are not same
    val person1 = new Person("TestAgain", 1)
    val person2 = new Person("Test", 3)
    print("person1('TestAgain' , 1) >= person2('Test' , 3) : " + (person1 >= person2) + "\n")
    print("person1('TestAgain' , 1) <= person2('Test' , 3) : " + (person1 <= person2) + "\n")
  }

}
