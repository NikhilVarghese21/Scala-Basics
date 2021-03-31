// Author - Nikhil Varghese

package org.knoldus.repo

import org.knoldus.dao.Dao
import org.knoldus.database.DatabaseConnection_Api
import org.knoldus.models.User

import scala.util.{Failure, Success, Try}
import scala.collection.mutable

class UserRepository extends Dao[User] with DatabaseConnection_Api {
  val dataRepository: mutable.Map[Int, User] = mutable.Map()

  // Adds user to dataRepository and calls the insertUserDatabase method.
  override def createUser(user: User): Boolean = {
    Try {
      dataRepository += user.id -> user
      val result = insertUserDatabase(user)

    } match {
      case Success(_) => true
      case Failure(_) => false
    }
  }

  // Returns the dataRepository and calls the selectUser
  override def listUser(): List[User] = {
    val result = selectUser()
    dataRepository.values.toList
  }

  // Returns a set containing each key in dataRepository.
  override def listUserId(): List[Int] = dataRepository.keySet.toList

  //Updates the name of User whose Id is passed in the method.
  override def updateUser(id: Int, new_name: String):Boolean = {
    Try {
      val user = User(id, new_name, dataRepository(id).usertype)
      dataRepository(id) = user
      val result = updateUserDatabase(id, new_name)
    } match {
      case Failure(_) => false
      case Success(_) =>true
    }
  }

  // Deletes user whose Id is passed in the method.
  override def deleteUser(id : Int):Boolean = {
    Try {
      dataRepository -= id
      val result = deleteUserDatabase(id)
    } match {
      case Failure(_) => false
      case Success(_) => true
    }
  }

  // Returns the name of user whose Id is passed in the method.
  override def getUserNameById(id: Int): String = {
    val result = getUserNameByIdDatabase(id)
    dataRepository(id).name
  }

}

