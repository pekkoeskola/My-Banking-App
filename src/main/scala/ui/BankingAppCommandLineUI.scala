package bankingapp
package ui

import scala.io.StdIn.readLine

object BankingAppCommandLineUI extends App:


  //Initialize bank instance quick

  val bank = Bank("my bank")

  //actual ui

  println("Welcome to bankingapp")

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
              case "exit" =>
              case _ => throw IllegalCommandException("no such command", input)
          case a: Admin =>
            input match
              case "exit" =>
              case _ => throw IllegalCommandException("no such command", input)

      catch

        case IllegalCommandException(_, cmd) => 
          println("[" + cmd + "] is not a valid command")
          validcommand = false

    input