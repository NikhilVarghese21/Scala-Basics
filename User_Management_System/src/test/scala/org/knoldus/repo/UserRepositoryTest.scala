// Author - Nikhil Varghese

package org.knoldus.repo

import org.knoldus.models.{User, UserType}
import org.scalatest.flatspec.AnyFlatSpec

class UserRepositoryTest extends AnyFlatSpec {

  val userRepository = new UserRepository
  val userAdmin = User( 1, "Ronaldo" , UserType.ADMIN)
  val userCustomer = User(2 , "Lionel Messi" , UserType.CUSTOMER)
  val userCustomerTwo = User(3 , "Eden Hazard" , UserType.CUSTOMER)

  val input1 = 4

  //Test case for createUser method
  "Validating createUser" should "be valid when adding admin" in {
    assert(userRepository.createUser(userAdmin))
  }

  "Validating createUser" should "be valid when adding customer" in {
    assert(userRepository.createUser(userCustomer))
  }

  "Validating createUser" should "be invalid" in {
    val actualResult = userRepository.createUser(userCustomerTwo)
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for getUserList method
  "Validating getUserList" should "be valid" in {
    val actualResult = userRepository.listUser()
    val expectedResult = List(userAdmin,userCustomer)
    assert(actualResult != expectedResult)
  }
  "Validating getUserList" should "be invalid" in {
    val actualResult = userRepository.listUser()
    val expectedResult = List(userCustomer,userCustomerTwo)
    assert(actualResult != expectedResult)
  }

  //Test case for listUserId method
  "Validating listUserId" should "be valid" in {
    val actualResult = userRepository.listUserId()
    val expectedResult = List(1,2)
    assert(actualResult != expectedResult)
  }
  "Validating listUserId" should "be invalid" in {
    val actualResult = userRepository.listUserId()
    val expectedResult = List(1)
    assert(actualResult != expectedResult)
  }

  //Test case for updateUser method
  "Validating updateUser" should "be valid" in {
    assert(userRepository.updateUser(1, "Timo Werner"))
  }
  "Validating updateUser" should "be invalid" in {
    assert(!userRepository.updateUser(input1, "Ziyech"))
  }

  //Test case for deleteUser method
  "Validating deleteUser" should "be valid" in {
    assert(userRepository.deleteUser(1))
  }
  "Validating deleteUser" should "be invalid" in {
    assert(userRepository.deleteUser(input1))
  }

  //Test case for getUserNameById method
  "Validating getUserNameById" should "be valid" in {
    val actualResult = userRepository.getUserNameById(2)
    val expectedResult = "Lionel Messi"
    assert(actualResult === expectedResult)
  }
  "Validating getUserNameById" should "be invalid" in {
    val actualResult = userRepository.getUserNameById(2)
    val expectedResult = "Ziyech"
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
    userRepository.deleteUser(3)
  }

  /* DatabaseConnection_Api File Method Testing */

  //Test case for insertUserDatabase method
  "Validating insertUserDatabase" should "be valid when adding admin" in {
    val actualResult = userRepository.insertUserDatabase(userAdmin)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }
  "Validating insertUserDatabase" should "be valid when adding customer" in {
    val actualResult = userRepository.insertUserDatabase(userCustomer)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }
  "Validating insertUserDatabase" should "be invalid" in {
    val actualResult = userRepository.insertUserDatabase(userCustomerTwo)
    val expectedResult =  false
    assert(actualResult != expectedResult)
  }

  //Test case for selectUser method
  "Validating selectUser" should "be valid" in {
    val actualResult = userRepository.selectUser
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating selectUser" should "be invalid" in {
    val actualResult = userRepository.selectUser
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for updateUserDatabase method
  "Validating updateUserDatabase" should "be valid" in {
    val actualResult = userRepository.updateUserDatabase(1,"Timo Werner")
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating updateUserDatabase" should "be invalid" in {
    val actualResult = userRepository.updateUserDatabase(input1, "Ziyech")
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for deleteUserDatabase method
  "Validating deleteUserDatabase" should "be valid" in {
    val actualResult = userRepository.deleteUserDatabase(1)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating deleteUserDatabase" should "be invalid" in {
    val actualResult = userRepository.deleteUserDatabase(input1)
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for getUserNameByIdDatabase method
  "Validating getUserNameByIdDatabase" should "be valid" in {
    val actualResult = userRepository.getUserNameByIdDatabase(2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating getUserNameByIdDatabase" should "be invalid" in {
    val actualResult = userRepository.getUserNameByIdDatabase(2)
    val expectedResult = false
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
    userRepository.deleteUser(3)
  }
}