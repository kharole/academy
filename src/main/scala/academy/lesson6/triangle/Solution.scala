package academy.lesson6.triangle

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    def triangle(p: Long, q: Long, r: Long) = p + q > r && q + r > p && p + r > q

    a.sorted.sliding(3).filter(_.length == 3).map { case Array(p, q, r) => triangle(p, q, r) }.find(_ == true).map(_ => 1).getOrElse(0)
  }
}