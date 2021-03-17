// Calculator

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec {

  val positiveInput1:Double = 21
  val positiveInput2:Double = 36
  val negativeInput1:Double = -21
  val negativeInput2:Double = -36
  val zero = 0


    //Test cases for Addition

    "the addition" should "be valid when both inputs are positive" in {
      val calc = new Calculator()
      val actualResult = calc.addition(positiveInput1,positiveInput2)
      val expectedResult = 57
    assert(actualResult === expectedResult)
  }

  "the addition" should "be valid when both inputs are negative" in {
    val calc = new Calculator()
    val actualResult = calc.addition(negativeInput1,negativeInput2)
    val expectedResult = -57
    assert(actualResult === expectedResult)
  }

    "the addition" should "be valid when input before operator is negative" in {
      val calc = new Calculator()
      val actualResult = calc.addition(negativeInput1,positiveInput2)
      val expectedResult = 15
      assert(actualResult === expectedResult)
    }

      "the addition" should "be valid when input after operator is negative" in {
        val calc = new Calculator()
        val actualResult = calc.addition(positiveInput1,negativeInput2)
        val expectedResult = -15
        assert(actualResult === expectedResult)
      }


        "the addition" should "not be valid" in {
        val calc = new Calculator()
        val actualResult = calc.addition(positiveInput1,negativeInput2)
        val expectedResult = -14
        assert(actualResult != expectedResult)
      }

        //Test cases for Subtraction

          "the subtraction" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.subtraction(positiveInput1,positiveInput2)
            val expectedResult = -15
            assert(actualResult === expectedResult)
        }

        "the subtraction" should "be valid when both inputs are negative" in {
          val calc = new Calculator()
          val actualResult = calc.subtraction(negativeInput1,negativeInput2)
          val expectedResult = 15
          assert(actualResult === expectedResult)
        }

        "the subtraction" should "be valid when input before operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.subtraction(negativeInput1,positiveInput2)
          val expectedResult = -57
          assert(actualResult === expectedResult)
        }

        "the subtraction" should "be valid when input after operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.subtraction(positiveInput1,negativeInput2)
          val expectedResult = 57
          assert(actualResult === expectedResult)
        }

          "the subtraction" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.subtraction(positiveInput1,negativeInput2)
            val expectedResult = -57
            assert(actualResult != expectedResult)
        }

          //Test cases for Multiplication

          "the multiplication" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.multiplication(positiveInput1,positiveInput2)
            val expectedResult = 756
            assert(actualResult === expectedResult)
        }

        "the multiplication" should "be valid when both inputs are negative" in {
          val calc = new Calculator()
          val actualResult = calc.multiplication(negativeInput1,negativeInput2)
          val expectedResult = 756
          assert(actualResult === expectedResult)
        }

        "the multiplication" should "be valid when input before operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.multiplication(negativeInput1,positiveInput2)
          val expectedResult = -756
          assert(actualResult === expectedResult)
        }

        "the multiplication" should "be valid when input after operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.multiplication(positiveInput1,negativeInput2)
          val expectedResult = -756
          assert(actualResult === expectedResult)
        }

          "the multiplication" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.multiplication(positiveInput1,negativeInput2)
            val expectedResult = -756
            assert(actualResult === expectedResult)
        }

          //Test cases for Division

          "the division" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.division(positiveInput1,positiveInput2)
            val expectedResult = 0.5833333333333334
            assert(actualResult === expectedResult)
        }

          "the division" should "be valid when both inputs are negative" in {
            val calc = new Calculator()
            val actualResult = calc.division(negativeInput1,negativeInput2)
            val expectedResult = 0.5833333333333334
            assert(actualResult === expectedResult)
        }

        "the division" should "be valid when input before operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.division(negativeInput1,positiveInput2)
          val expectedResult = -0.5833333333333334
          assert(actualResult === expectedResult)
        }

        "the division" should "be valid when input after operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.division(positiveInput2,negativeInput2)
          val expectedResult = -1.0
          assert(actualResult === expectedResult)
        }

        //checking for exception when divisor is 0.
        "the division" should "produce IllegalArgumentException when divisor is 0" in {
          val calc = new Calculator()
          assertThrows[IllegalArgumentException] {
            val actualResult = calc.division(positiveInput1,zero)
          }
        }

        "the division" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.division(positiveInput2,negativeInput2)
            val expectedResult = 1.0
            assert(actualResult != expectedResult)
        }

        //Test cases for Power

          "the power" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.power(positiveInput2,positiveInput2)
            val expectedResult = 1.0638735892371651E56
            assert(actualResult === expectedResult)
        }

        "the power" should "be valid when both inputs are negative" in {
          val calc = new Calculator()
          val actualResult = calc.power(negativeInput1,negativeInput2)
          val expectedResult = 2.5124960611210866E-48
          assert(actualResult === expectedResult)
        }

        "the power" should "be valid when input before operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.power(negativeInput1,positiveInput2)
          val expectedResult = 3.980105742151077E47
          assert(actualResult === expectedResult)
        }

        "the power" should "be valid when input after operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.power(positiveInput1,negativeInput2)
          val expectedResult = 2.5124960611210866E-48
          assert(actualResult === expectedResult)
        }

        "the power" should "not be valid" in {
          val calc = new Calculator()
          val actualResult = calc.power(positiveInput1,negativeInput2)
          val expectedResult = 3.5124960611210866E-48
          assert(actualResult != expectedResult)
        }

        //Test cases for Absolute

          "the absolute" should "be valid when input is positive" in {
            val calc = new Calculator()
            val actualResult = calc.absolute(positiveInput1)
            val expectedResult = 21
            assert(actualResult === expectedResult)
          }

        "the absolute" should "be valid when input is negative" in {
          val calc = new Calculator()
          val actualResult = calc.absolute(negativeInput2)
          val expectedResult = 36
          assert(actualResult === expectedResult)
        }

          "the absolute" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.absolute(positiveInput2)
            val expectedResult = -36
            assert(actualResult != expectedResult)
        }

        //Test cases for Modulus

          "the modulus" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.modulus(positiveInput1,positiveInput2)
            val expectedResult = 21
            assert(actualResult === expectedResult)
        }


        "the modulus" should "be valid when both inputs are negative" in {
          val calc = new Calculator()
          val actualResult = calc.modulus(negativeInput1,negativeInput2)
          val expectedResult = -21
          assert(actualResult === expectedResult)
        }

        "the modulus" should "be valid when input before operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.modulus(negativeInput1,positiveInput2)
          val expectedResult = -21
          assert(actualResult === expectedResult)
        }

        "the modulus" should "be valid when input after operator is negative" in {
          val calc = new Calculator()
          val actualResult = calc.modulus(positiveInput1,negativeInput2)
          val expectedResult = 21
          assert(actualResult === expectedResult)
        }

        //Checking for Exception when num2 is 0
        "the modulus" should "produce an IllegalArgumentException when num2 is 0" in {
          val calc = new Calculator()
          assertThrows[IllegalArgumentException] {
            val actualResult = calc.modulus(positiveInput1,0)
          }
          }

          "the modulus" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.modulus(positiveInput1,negativeInput2)
            val expectedResult = 22
            assert(actualResult != expectedResult)
        }

        //Test cases for Maximum

          "the maximum" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.maximum(positiveInput1,positiveInput2)
            val expectedResult = 36
            assert(actualResult === expectedResult)
          }

        "the maximum" should "be valid when both inputs are negative" in {
          val calc = new Calculator()
          val actualResult = calc.maximum(negativeInput1,negativeInput2)
          val expectedResult = -21
          assert(actualResult === expectedResult)
        }

        "the maximum" should "be valid when only one input is positive" in {
          val calc = new Calculator()
          val actualResult = calc.maximum(positiveInput1,negativeInput2)
          val expectedResult = 21
          assert(actualResult === expectedResult)
        }

          "the maximum" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.maximum(negativeInput1,positiveInput2)
            val expectedResult = -21
            assert(actualResult != expectedResult)
        }

         //Test cases for Minimum

          "the minimum" should "be valid when both inputs are positive" in {
            val calc = new Calculator()
            val actualResult = calc.minimum(positiveInput1,positiveInput2)
            val expectedResult = 21
            assert(actualResult === expectedResult)
        }

        "the minimum" should "be valid when both inputs are negative" in {
          val calc = new Calculator()
          val actualResult = calc.minimum(negativeInput1,negativeInput2)
          val expectedResult = -36
          assert(actualResult === expectedResult)
        }

        "the minimum" should "be valid when only one input is positive" in {
          val calc = new Calculator()
          val actualResult = calc.minimum(positiveInput1,negativeInput2)
          val expectedResult = -36
          assert(actualResult === expectedResult)
        }

          "the minimum" should "not be valid" in {
            val calc = new Calculator()
            val actualResult = calc.minimum(negativeInput1,positiveInput2)
            val expectedResult = 21
            assert(actualResult != expectedResult)
          }

}
