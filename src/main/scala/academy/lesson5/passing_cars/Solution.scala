package academy.lesson5.passing_cars

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    Some(a.zip(a.scanRight(0)((s, e) => s + e)).filter(_._1 == 0).map(_._2.toLong).sum).filter(_ <= 1000000000).map(_.toInt).getOrElse(-1)
  }
}