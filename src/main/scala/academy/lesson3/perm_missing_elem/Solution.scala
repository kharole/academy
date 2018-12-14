package academy.lesson3.perm_missing_elem

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val b = a.map(_.toLong)
    val ts = ((b.length.toLong + 1) * (b.length.toLong + 2)) / 2
    val rs = b.sum
    (ts - rs).toInt
  }
}