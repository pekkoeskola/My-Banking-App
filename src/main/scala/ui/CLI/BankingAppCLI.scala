package bankingapp
package ui
package CLI

import bankingapp.ui.commands.*

import scala.io.StdIn.readLine

/** Can be used to run a ui for bank entity bank that is given as ca constructor parameter.
  * 
  */

class BankingAppCLI(val bank: Bank):

  val customerCommands = Set("exit")

  val AdminCommands = Set("exit")

  def run() = 

    var quit = false

    println("Welcome to bankingapp")

    while !quit do

      val user = authenticate()

      var loggedin = true

      while loggedin do

        requestCommand(user)

  //currently stub
  def authenticate(): User =

    var unsuccessful = false

    while !unsuccessful do 

      var input = readLine("Enter username: ")

      input match
        //case "Admin" =>
        case _ => unsuccessful = true

    bank.admin


  def requestCommand(user: User) =

    var validcommand = false

    var input: String = ""

    while !validcommand do

      input = readLine("Type a command: ")

      validcommand = true

      try

        user match
          case c: Customer =>
            input match
              case cmd if customerCommands contains cmd =>
              case _ =>
                validcommand = false 
                throw IllegalCommandException("no such command", input)
          case a: Admin =>
            input match
              case cmd if customerCommands contains cmd =>
              case _ =>
                validcommand = false
                throw IllegalCommandException("no such command", input)

      catch

        case IllegalCommandException(_, cmd) => 
          println("[" + cmd + "] is not a valid command")
          validcommand = false

    input

  def executeCommand() = 0