package bankingapp
package tests

import org.scalatest.flatspec.AnyFlatSpec

class AccountSpec extends AnyFlatSpec:

  val acc = BasicAccount("myaccount")

  "Class BasicAccount after initial creation" should "have publically accessible member name as initialised" in {
    assert(acc.name === "myaccount")
  }

  it should "have publically accessible member balance that is initialised as 0" in {
    assert(acc.balance === 0)
  }

  it should "have publically accessible member transactions that is empty " in {
    assert(acc.transactions.isEmpty)
  }