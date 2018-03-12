object Main {

  def main(args: Array[String]): Unit = {

    var myBankAccount = new BankAccount

    myBankAccount.withdraw(30)

    var myCheckingAccount = new CheckingAccount

    myCheckingAccount.deposit(30) // $30 - $1 fee
    myCheckingAccount.withdraw(10) // $29 - $10 - $1 fee

    println(myCheckingAccount.balance)

  }

}
