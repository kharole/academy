package academy.misc.tripples_sum

import java.io.PrintWriter

import scala.io.StdIn

object Solution {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val p = a.toList.zip(b.toList).map {
      case (a, b) if (a > b) => (1, 0)
      case (a, b) if (a < b) => (0, 1)
      case (a, b) if (a == b) => (0, 0)
    }.foldLeft((0, 0))((s, i) => (s._1 + i._1, s._2 + i._2))
    Array(p._1, p._2)
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = compareTriplets(a, b)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
