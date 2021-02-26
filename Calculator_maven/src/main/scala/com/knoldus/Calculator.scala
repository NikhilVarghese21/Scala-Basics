// Calculator

package com.knoldus

class Calculator {
  def addition(num1:Double, num2:Double):Double = num1 + num2
  def subtraction(num1:Double, num2:Double):Double = num1 - num2
  def multiplication(num1:Double, num2:Double):Double = num1 * num2

  def division(num1:Double, num2:Double):Double = {
     require(num2 != 0, "Denominator cannot be 0")
     num1 / num2
  }

  def power(num1:Double, num2:Double):Double = math.pow(num1,num2)

  //returns the value after removing negative sign.
  def absolute(num:Double):Double = num.abs

  //returns the remainder after dividing the numbers.
  def modulus(num1:Double, num2:Double):Double = {
    require(num2 != 0, "Denominator cannot be 0")
    num1 % num2
  }
  //returns maximum of the two numbers.
  def maximum(num1:Double, num2:Double):Double = if (num1 > num2) num1 else num2

  //returns the minimum of the two numbers.
  def minimum(num1:Double, num2:Double):Double = if (num1 < num2) num1 else num2
}
