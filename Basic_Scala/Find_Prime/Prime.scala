object Prime {
  def main(args: Array[String]): Unit = {

    var ten: Array[Int] = 1 to 21 toArray

    def printPrime(xs: Array[Int]) = {

      var a = for (x <- xs if x % 2 != 0 & x % 3 != 0 | x == 2 | x == 3 ) yield x

      println(a.mkString(" "))

        }

    printPrime(ten)

  }
}
