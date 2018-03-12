object quickSort {

    def main(args:Array[String]) = {

      def qSort(x: Array[Int]): Array[Int] = {
        if (x.length <= 1) x
        else {

          val pivot = x(x.length / 2)

          Array.concat(

            qSort(x filter (pivot >)),
            qSort(x filter (pivot ==)),
            qSort(x filter (pivot <))

          )
        }
      }

      val res = qSort(Array(6,7,10,3,2,1,4))

      println(res.mkString(" "))

    }
}
