// Author - Nikhil Varghese

package org.knoldus.validate

import org.knoldus.dao.Dao
import org.knoldus.models.{User, UserType}
import org.knoldus.repo.UserRepository
import org.scalatest.flatspec.AnyFlatSpec

class UserValidateTest extends AnyFlatSpec{

  val repository : Dao[User] = new UserRepository()
  val operations = new UserValidate(repository)
  val userAdmin = User( 1, "Ronaldo" , UserType.ADMIN)
  val userCustomer = User(2 , "Lionel Messi" , UserType.CUSTOMER)
  val userCustomerTwo = User(3 , "Eden Hazard" , UserType.CUSTOMER)

  val input1 = 4
  val input2 = 19

  //Test case for addUser method
  "Validating addUser" should "be valid when adding admin" in {
    val actualResult = operations.addUser(userAdmin)
    val expectedResult = "Data Inserted.\n"
    assert(actualResult === expectedResult)
  }

  "Validating addUser" should "be valid when adding customer" in {
    val actualResult = operations.addUser(userCustomer)
    val expectedResult = "Data Inserted.\n"
    assert(actualResult === expectedResult)
  }

  "Validating addUser" should "be invalid" in {
    val actualResult =operations.addUser(userCustomerTwo)
    val expectedResult = "Invalid Data.\n"
    assert(actualResult != expectedResult)
  }

  //Test case for getUserList method
  "Validating getUserList" should "be valid" in {
    val actualResult = operations.getUserList
    val expectedResult = List(userCustomer, userAdmin, userCustomerTwo)
    assert(actualResult === expectedResult)
  }

  "Validating getUserList" should "be invalid" in {
    val actualResult = operations.getUserList
    val expectedResult = List(userAdmin, userCustomer)
    assert(actualResult != expectedResult)
  }

  //Test case for removeUser method
  "Validating removeUser" should "be valid" in {
    assert(operations.removeUser(1))
  }

  "Validating removeUser" should "be invalid" in {
    assert(!operations.removeUser(input1))
  }

  //Test case for changeUserName method
  "Validating changeUserName" should "be valid" in {
    assert(operations.changeUserName(2, "Timo Werner"))
  }

  "Validating changeUserName" should "be invalid" in {
    assert(!operations.changeUserName(input1, "Ziyech"))
  }

  //Test case for getUser method
  "Validating getUser" should "be valid" in {
    val actualResult = operations.getUser(2)
    val expectedResult = "Timo Werner"
    assert(actualResult === expectedResult)
  }

  "Validating getUser" should "be invalid" in {
    val actualResult = operations.getUser(input1)
    val expectedResult = "Timo Werner"
    assert(actualResult != expectedResult)
  }

  //Test case for getUserIdList method
  "Validating getUserIdList" should "be valid" in {
    val actualResult = operations.getUserIdList
    val expectedResult = List(2,3)
    assert(actualResult === expectedResult)
  }

  "Validating getUserIdList" should "be invalid" in {
    val actualResult = operations.getUserIdList
    val expectedResult = List(1,2,3)
    assert(actualResult != expectedResult)
    operations.removeUser(1)
    operations.removeUser(2)
    operations.removeUser(3)
  }
}