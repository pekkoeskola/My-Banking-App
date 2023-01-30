package bankingapp
package ui

import scala.io.StdIn.readLine

object BankingAppCommandLineUI extends App:

  val acc = BasicAccount("savings")

  println("Welcome to bankingapp")

  var input = readLine("Type a command: ")

  while input != "exit" do

    input match
      case _ =>
    
    input = readLine("Type a command: ")