package academy.lesson3.perm_missing_elem

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val ts = ((a.length + 1) * (a.length + 2)) / 2
    val rs = a.sum
    ts - rs
  }
}