// Author - Nikhil Varghese

package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person]{ // Ordered Trait

  //overriding compare method in Ordered Trait for comparing Person's age and length of names.
  override def compare(that : Person) : Int  = {
    if (this.name == that.name) { //comparing age of Person's if names are equal.
      if (this.age < that.age) {
        this.age - that.age
      }
      else {
        that.age - this.age
      }
    }
    else { //comparing the length of names if names are not equal
      if (this.name.length < that.name.length) {
        this.name.length - that.name.length
      }
      else {
        this.name.length - that.name.length
      }
    }

  }

}

