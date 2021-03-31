// Author - Nikhil Varghese

package org.knoldus.dao

trait Dao[A]{

  def createUser(userDetails:A) : Boolean

  def listUser(): List[A]

  def updateUser(id: Int , name: String) : Boolean

  def deleteUser(id: Int) : Boolean

  def listUserId() : List[Int]

  def getUserNameById(id : Int) : String

}
