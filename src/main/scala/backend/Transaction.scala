package bankingapp

import java.util.Date

sealed class Transaction:

  val timeOfCreation = new Date()

  val id: Int = Transaction.createUniqueTransactionID

case class Deposit(amount: Int) extends Transaction

case class Withdrawal(amount: Int) extends Transaction

object Transaction:

  private var lastTransactionID = 34456

  def createUniqueTransactionID = 
    lastTransactionID = lastTransactionID+ 1
    lastTransactionID + 1