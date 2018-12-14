package academy.lesson2.odd_occurrences_in_array

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")


object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val b = a.sorted

    for(i <- 0 until b.length) {
      b(i) *= (if (i%2 == 0) 1 else -1)
    }
    b.sum.abs
  }
}