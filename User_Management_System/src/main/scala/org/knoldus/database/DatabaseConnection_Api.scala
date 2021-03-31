// Author - Nikhil Varghese

package org.knoldus.database

import org.knoldus.models.User

import java.sql.{Connection, DriverManager}

trait DatabaseConnection_Api {

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost/mysql"
  val username = "Nikhil"
  val password = "Nvnikhil@1997"

  var connection: Connection = _

  // Inserts data into Database.
  def insertUserDatabase(user: User): Boolean = {

    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()

      val id = user.id
      val name = user.name
      val userType = user.usertype

      statement.executeUpdate(s"INSERT INTO Testdb.user VALUES ('$id', '$name','$userType')")
      true
    }
    catch {
      case e: Throwable => e.printStackTrace()
                           false
    }
    finally {
      connection.close()
    }

  }

  // Retrieves data from Database.
  def selectUser(): Boolean = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT * FROM Testdb.user")
      print("DATA FROM DATABASE: \n")
      while ( resultSet.next() )
      {
        val id = resultSet.getString("Id")
        val name = resultSet.getString("Name")
        val userType = resultSet.getString("UserType")
        print("Id = " + id + ", Name = " + name + ", User Type = " + userType + "\n")
      }
      true
    }
    catch {
      case e: Throwable => e.printStackTrace()
                           false
    }
    finally {
      connection.close()
    }

  }

  // Updates User's name from Database whose Id is passed in the method.
  def updateUserDatabase(id: Int, new_name: String): Boolean = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val idToChange = id
      val newName = new_name
      statement.executeUpdate(s"UPDATE Testdb.user SET name = '$newName' where id = '$idToChange'")
      true
    }
    catch {
      case e: Throwable => e.printStackTrace()
                           false
    }
    finally {
      connection.close()
    }

  }

  // deletes user from Database based on Id passed in the method.
  def deleteUserDatabase(id : Int) : Boolean = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val idToDelete = id
      statement.executeUpdate(s"DELETE from Testdb.user where id = '$idToDelete'")
      true
    }
    catch {
      case e: Throwable => e.printStackTrace()
                           false
    }
    finally {
      connection.close()
    }

    }

  // Retrieves name from database whose Id is passed in method.
  def getUserNameByIdDatabase(id: Int): Boolean = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val Id = id
      val resultSet = statement.executeQuery(s"SELECT Name FROM Testdb.user where id = '$Id'")
      print("RETRIEVING NAME BY ID: \n")
      while ( resultSet.next() ) {
        val name = resultSet.getString("Name")
        print("Name = " + name )
      }
      true
    }
    catch {
      case e: Throwable => e.printStackTrace()
                           false
    }
    finally {
      connection.close()
    }
  }

}
