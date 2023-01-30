package bankingapp

import scala.util.Random
import scala.collection.mutable.Buffer

class Customer(firstName: String, lastName: String):

  val id = Customer.createUniqueCustomerID

  val accounts: Buffer[Account] = Buffer[Account]()


/** Companion object for class Customer. Used to create unique IDs for each.
  * 
  */

object Customer:

  private var lastCustomerID = 34456

  def createUniqueCustomerID = 
    lastCustomerID = lastCustomerID + 1
    lastCustomerID + 1