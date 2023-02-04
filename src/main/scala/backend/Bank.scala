package bankingapp

import scala.collection.mutable.Buffer

class Bank(Name: String):

  private val _customers = Buffer[Customer]()

  val admin = new Admin

  def customers: Vector[Customer] = _customers.toVector

  def customerIDs = _customers.map(_.ID).toVector


  def addCustomer(customer: Customer) = _customers += customer