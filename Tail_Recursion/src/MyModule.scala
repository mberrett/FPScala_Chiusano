// A comment
/* Another comment */
/** A documentation comment */

object MyModule { // Declares a singleton object, which simultaneously declares a class and its only instance

  def abs(n: Int): Int = // abs take an integer and returns an integer
    if (n < 0) -n // returns the negation of n if it's less than zero
    else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)
  }

  def fib(x: Int): BigInt = {
    def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, (next + prev))
    }
    fibHelper(x)
  }

  private def formatAbs(x: Int) = {             // A private method can only be called by other members of Module
    val msg = "The absolute value of %d is %d"  // A string with two placeholders for numbers marked as %d
    msg.format(x, abs(x))                       // Replaces the two %d placeholders in the string with x
  }                                             // and abs(x) respectively

  private def formatFactorial(x: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(x, factorial(x))
  }

  private def formatFibonacci(x: Int) = {
    val msg = "The %dth Fibonacci number is %d"
    msg.format(x, fib(x))
  }

  def main(args: Array[String]): Unit =  // Unit serves the same purpose as void in languages like Java or C
    println(formatAbs(-7))
    println(formatFactorial(7))
    println(formatFibonacci(7))
}
