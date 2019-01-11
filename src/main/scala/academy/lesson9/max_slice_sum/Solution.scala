package academy.lesson9.max_slice_sum

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    a.scanLeft(0)((s, e) => Math.max(e + s, e)).drop(1).max
  }
}