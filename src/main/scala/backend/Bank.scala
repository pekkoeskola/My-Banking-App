package bankingapp

import scala.collection.mutable.Buffer

class Bank(Name: String):

  private val _customers = Buffer[Customer]()

  def customers: Vector[Customer] = _customers.toVector


  def addCustomer(customer: Customer) = _customers += customer