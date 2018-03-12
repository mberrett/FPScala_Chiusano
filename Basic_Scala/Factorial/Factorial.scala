object Factorial {

    def main(args: Array[String]): Unit = {


      def factorial(n: Int): Int = {

        val xs = n to 1 by -1 toArray

        if (xs == 1) 0 else xs.reduceLeft(_*_)
      }

      println(factorial(5))
  }
}
