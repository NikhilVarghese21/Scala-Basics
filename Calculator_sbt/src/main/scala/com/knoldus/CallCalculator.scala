// Calculator

package com.knoldus

import scala.io.StdIn.readInt
import scala.io.StdIn.readFloat
import scala.io.StdIn.readLine


object CallCalculator {
  def main(args:Array[String]): Unit =
  {
    val (addition, subtraction, multiplication, division, power, absolute, modulus, maximum, minimum) = (1, 2, 3, 4, 5, 6, 7, 8, 9)
    var continue = "Y"
    val calc = new Calculator()
    while (continue == "Y" || continue == "y") {
        try {
        print("\nCALCULATOR\n")
        print("1. Addition\n")
        print("2. Subtraction\n")
        print("3. Multiplication\n")
        print("4. Division\n")
        print("5. Power\n")
        print("6. Absolute\n")
        print("7. Modulus\n")
        print("8. Maximum\n")
        print("9. Minimum\n")
        print("Choose an Option (1 - 9) : ")
        val option = readInt()
        option match {
          case `addition` => val (num1, num2) = inputnumbers
                             print("Addition of " + num1 + " and " + num2 + " is : " + calc.addition(num1, num2))
          case `subtraction` => val (num1, num2) = inputnumbers
                                print("Subtraction of " + num1 + " and " + num2 + " is : " + calc.subtraction(num1, num2))
          case `multiplication` => val (num1, num2) = inputnumbers
                                   print("Multiplication of " + num1 + " and " + num2 + " is : " + calc.multiplication(num1, num2))
          case `division` => val (num1, num2) = inputnumbers
                             print("Division of " + num1 + " and " + num2 + " is : " + calc.division(num1, num2))
          case `power` => val (num1, num2) = inputnumbers
                          print("Power of " + num1 + " and " + num2 + " is : " + calc.power(num1, num2))
          case `absolute` => print("Enter Number : ")
                             val num1 = readFloat()
                             print("Absolute value of " + num1 + " is : " + calc.absolute(num1))
          case `modulus` => val (num1, num2) = inputnumbers
                            print("Modulus of " + num1 + " and " + num2 + " is : " + calc.modulus(num1, num2))
          case `maximum` => val (num1, num2) = inputnumbers
                            print("Maximum of " + num1 + " and " + num2 + " is : " + calc.maximum(num1, num2))
          case `minimum` => val (num1, num2) = inputnumbers
                            print("Minimum of " + num1 + " and " + num2 + " is : " + calc.minimum(num1, num2))
          case _ => print("Enter a valid option")
        }
      }
        catch {
          case _: NumberFormatException => print("Enter a valid option.")
          case _: IllegalArgumentException => print("Denominator cannot be 0")
        }
        print("\nDo you want to continue (Y or N): ")
        continue = readLine()
    }
    }
    // Inputs Number from User
    def inputnumbers: (Double,Double) = {
      print("Enter Number 1 : ")
      val num1 = readFloat()
      print("Enter Number 2: ")
      val num2 = readFloat()
      (num1,num2)
    }
}
