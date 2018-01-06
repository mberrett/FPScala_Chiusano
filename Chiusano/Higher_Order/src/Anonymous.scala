object Anonymous {

  // Factoring out "sum" pattern shared by sumInt and sumCubes
  def sum(f: Int => Int, a: Int, b: Int): Int =
  {if (a > b) 0 else f(a) + sum(f, a+1, b)}

  // sums all integers between a and b, limits included
  def sumInt(a: Int, b: Int) = sum(x => x, a, b)
  // sums the cube of all integers between 1 and 5, limits included
  def sumCubes(a: Int, b: Int) = sum(x => x*x*x, a, b)

  def main(args: Array[String]): Unit = {

    println(sumInt(1,5)) // 1 + 2 + 3 + 4 + 5
    println(sumCubes(1,5)) // same as below
    println(List(1,2,3,4,5).map(x => x*x*x).reduceLeft(_+_))

  }
}
