import scala.io.Source

object WriteTen {

  def main(args: Array[String]) = {

      println("Words whose length exceeds 10 characters: ")

    Source.fromFile("Demo.txt")
      .getLines()
      .flatMap(_.split("\\W+"))
      .filter(x=>x.length>10)
      .foreach{
        println
      }

  }

}
