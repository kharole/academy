package academy.lesson4.missing_integer

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    if(a.max > 0) {
      val result = new Array[Boolean](a.max)
      a.filter(_ > 0).foreach { e => result(e-1) = true }
      result.takeWhile(e => e).length + 1
    } else
      1
  }
}