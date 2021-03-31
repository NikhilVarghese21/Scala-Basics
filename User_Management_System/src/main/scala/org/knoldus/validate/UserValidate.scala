// Author - Nikhil Varghese

package org.knoldus.validate

import org.knoldus.dao.Dao
import org.knoldus.models.User

class UserValidate(repository: Dao[User]){

  //Checks if id passed is in dataRepository and calls createUser function if false.
  def addUser(user : User): String = {
    if(user.name.nonEmpty &&  !repository.listUserId().contains(user.id) )  {
      repository.createUser(user)
      "Data Inserted.\n"
    }
    else
    {
      "Invalid Data.\n"
    }
  }

  def getUserList: List[User] = repository.listUser()

  // Checks if id passed is in dataRepository and calls deleteUser with the id if the condition is true.
  def removeUser(id : Int) : Boolean = {
    if (repository.listUserId().contains(id)) {
      repository.deleteUser(id)
      true
    } else {
      false
    }
  }

  // Checks if id passed is in dataRepository and calls updateUser with the id and name if the condition is true.
  def changeUserName(id : Int , name: String) :Boolean = {
    if (repository.listUserId().contains(id)) {
      repository.updateUser(id, name)
      true
    }
    else {
      false
    }
  }

  // Checks if id passed is in dataRepository and calls getUserNameById with the id passed when it is true.
  def getUser(id : Int)  : String = {
    if(repository.listUserId().contains(id)) {
      repository.getUserNameById(id)
    }
    else {
      "Invalid User Id."
    }
  }

  def getUserIdList: List[Int] = repository.listUserId()

}

