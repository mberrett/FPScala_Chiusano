/**
  * Created by MatiasBerretta on 12/28/17.
  */
object Poly {

  val listStrings = List("Benito","Veronica", "Matias", "Juanbi", "Catu", "Justi", "Balti")
  val listIntegers = List(55, 50, 25, 23, 21, 16, 15)

  def hardSearchKey(a: List[String], key: String): Int = {
    def loop(n: Int): Int ={
      if (n > a.length) -1
      else if (a(n) == key) n+1 // +1 in order to account for zero-index
      else loop(n+1)
    }
    loop(0)
  }

  def abstractSearchKey[A](a: List[A], p: A => Boolean): Int = {
    def loop(n: Int): Int ={
      if (n > a.length) -1
      else if (p(a(n))) n+1 // If the function p matches the current element, we've found a match
      else loop(n+1)
    }
    loop(0)
  }

  private def formatHardSearchKey(x: String) = {
    val msg = "%s was found at position #%d of the list"
    msg.format(x, hardSearchKey(listStrings, x))
  }

  private def formatAbstractSearchKey(x: Int) = {
    val msg = "%d was found at position #%d of the list"
    msg.format(x, abstractSearchKey[Int](listIntegers, y => y == x)) // lambda function to satisfy type (Int) => Boolean
  }

  def main(args: Array[String]): Unit = { //Unit serves the same purpose as void in languages like Java or C
    println(formatHardSearchKey("Matias"))
    println(formatAbstractSearchKey(25))
  }
}
