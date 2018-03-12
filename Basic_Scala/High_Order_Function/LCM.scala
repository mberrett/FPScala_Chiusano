object LCM {

  def main(args: Array[String]): Unit = {

    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a%b)
    }

    def lcd(f: (Int, Int) => Int, a: Int, b: Int): Int = {
      a*b / f(a,b)
    }

    println(lcd(gcd,12,21))

  }
}
