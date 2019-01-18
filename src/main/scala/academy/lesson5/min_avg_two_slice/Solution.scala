package academy.lesson5.min_avg_two_slice

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {

  case class Slice(sum: Int, count: Int, last: Int, start: Int, stop: Int) {
    val avg = sum.toDouble / count.toDouble

    def min(i: Int): Slice = {
      val s1 = Slice(last + i, 2, i, stop, stop + 1)
      val s2 = Slice(sum + i, count + 1, i, start, stop + 1)
      if (s1.avg < s2.avg) s1 else s2
    }
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val zs = Slice(a(0) + a(1), 2, a(1), 0, 1)
    val ss = a.drop(2).scanLeft(zs)((s, i) => s.min(i))
    //println(ss.toList)
    ss.minBy(_.avg).start
  }
}