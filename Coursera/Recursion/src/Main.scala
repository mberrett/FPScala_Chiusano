package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c >= r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      val count = 0

      def loop(chars: List[Char], isClosed: Int): Boolean = {

        if (chars.isEmpty) {

          isClosed == 0

        } else {
          val h = chars.head
          val n =

            if (h == '(') isClosed + 1
            else if (h == ')') isClosed - 1
            else isClosed

          if (n >= 0) loop(chars.tail, n)
          else false
        }
      }

      loop(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      money match {
        case 0 => 1
        case x if x < 0 => 0
        case x if x >= 1 && coins.isEmpty => 0
        case _ => countChange(money, coins.tail) + countChange(money - coins.head, coins)
      }
    }
  }
