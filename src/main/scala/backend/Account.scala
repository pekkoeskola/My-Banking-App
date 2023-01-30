package bankingapp

import java.util.Date
import scala.collection.mutable.Buffer
import scala.annotation.newMain

abstract class Account(name: String):

  private var _balance: Int = 0

  def balance: Int = _balance

  private def balance_= (newBalance: Int) = _balance = newBalance


  private val _transactions: Buffer[Transaction] = Buffer[Transaction]()

  def transactions: Vector[Transaction] = _transactions.toVector
  

  val timeOfCreation = new Date()


  def deposit(amount: Int): Deposit =
    balance += amount
    val d = Deposit(amount)
    _transactions += d
    d

  def withdraw(amount: Int): Withdrawal =
    balance -= amount
    val w = Withdrawal(amount)
    _transactions += w
    w

/** Basic account that does not accrue interest over time.
  * 
  */

class BasicAccount(name: String) extends Account(name)
