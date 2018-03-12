import java.io._
import scala.io.Source

object Reverse {

  def main(args: Array[String]): Unit ={

    val writer = new PrintWriter(new File("Reverse.txt"))


    writer.write(

    Source.fromFile("Forward.txt")
      .getLines()
      .toList
      .reverse
      .mkString("\n")

    )

    writer.close()



  }
}
