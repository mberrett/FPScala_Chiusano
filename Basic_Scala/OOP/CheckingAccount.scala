class CheckingAccount extends BankAccount {

  override def deposit(d: Double): Unit = {

      balance = balance + d - 1.0

    }

  override def withdraw(w: Double): Unit = {

      balance = balance - w - 1.0

    }


  }
