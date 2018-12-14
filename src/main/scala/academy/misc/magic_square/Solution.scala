package academy.misc.magic_square

import java.io._
import java.lang.Math.abs

object Solution {

  val magic1 = Array(
    Array(8, 1, 6),
    Array(3, 5, 7),
    Array(4, 9, 2),
  )

  val magic2 = Array(
    Array(6, 1, 8),
    Array(7, 5, 3),
    Array(2, 9, 4),
  )

  val magic3 = Array(
    Array(2, 7, 6),
    Array(9, 5, 1),
    Array(4, 3, 8),
  )

  val magic4 = Array(
    Array(4, 3, 8),
    Array(9, 5, 1),
    Array(2, 7, 6),
  )

  val magic5 = Array(
    Array(2, 9, 4),
    Array(7, 5, 3),
    Array(6, 1, 8),
  )

  val magic6 = Array(
    Array(4, 9, 2),
    Array(3, 5, 7),
    Array(8, 1, 6),
  )

  val magic7 = Array(
    Array(6, 7, 2),
    Array(1, 5, 9),
    Array(8, 3, 4),
  )

  val magic8 = Array(
    Array(8, 3, 4),
    Array(1, 5, 9),
    Array(6, 7, 2),
  )


  val magics = List(magic1, magic2, magic3, magic4, magic5, magic6, magic7, magic8)

  def cost(m1: Array[Array[Int]], m2: Array[Array[Int]]): Int =
    abs(m1(0)(0) - m2(0)(0)) +
      abs(m1(0)(1) - m2(0)(1)) +
      abs(m1(0)(2) - m2(0)(2)) +
      abs(m1(1)(0) - m2(1)(0)) +
      abs(m1(1)(1) - m2(1)(1)) +
      abs(m1(1)(2) - m2(1)(2)) +
      abs(m1(2)(0) - m2(2)(0)) +
      abs(m1(2)(1) - m2(2)(1)) +
      abs(m1(2)(2) - m2(2)(2))

  // Complete the formingMagicSquare function below.
  def formingMagicSquare(s: Array[Array[Int]]): Int = {
    magics.map(cost(_, s)).min
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = Array.ofDim[Int](3, 3)

    for (i <- 0 until 3) {
      s(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = formingMagicSquare(s)

    printWriter.println(result)

    printWriter.close()
  }
}

