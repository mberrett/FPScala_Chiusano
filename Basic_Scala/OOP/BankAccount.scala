class BankAccount {

  private var _balance: Double = 0
  private val bound: Int = 0

  def balance = _balance
  def balance_=(newValue: Double): Unit = {if (newValue > bound) _balance = newValue else printWarning}

  private def printWarning = println("WARNING: Overdraft!")

  def deposit(d: Double): Unit = {

    balance = balance + d

  }

  def withdraw(w: Double): Unit = {

    balance = balance - w

  }

}
