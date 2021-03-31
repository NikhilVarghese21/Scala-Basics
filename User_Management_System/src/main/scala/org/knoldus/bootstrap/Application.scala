// Author - Nikhil Varghese

package org.knoldus.bootstrap

import org.knoldus.dao.Dao
import org.knoldus.models._
import org.knoldus.repo.UserRepository
import org.knoldus.validate.UserValidate

object Application extends App {

    val repository : Dao[User] = new UserRepository
    val operations = new UserValidate(repository)
    val userAdmin = User( 1, "Ronaldo" , UserType.ADMIN)
    val userCustomer = User(2 , "Lionel Messi" , UserType.CUSTOMER)
    print(operations.addUser(userAdmin)) //Inserting Data.
    print(operations.addUser(userCustomer)) //Inserting Data.
    //print("LIST OF USERS\n")
    //print(operations.getUserList())
    operations.getUserList
    //print("RETRIEVING NAME BY ID: \n")
    operations.getUser(1) //RETRIEVING NAME BY ID
    //print(operations.getUser(1))
    print("\nCHANGING NAME: ")
    //Changes Name of User whose Id(1) is passed in the method.
    if(operations.changeUserName(1 , "Cristiano Ronaldo")) {
      print("Updated")
    }
    else {
      print("Could not Update Name.")
    }
    operations.removeUser(2) // Deletes User with id 2.

}
