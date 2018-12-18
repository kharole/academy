package academy.lesson6.number_of_disc_intersections

import scala.annotation.tailrec
import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {

  case class Range(start: Long, finish: Long)

  @tailrec
  def countPairs(c: Int, srs: List[Range]): Int =
    if (c > 10000000) -1
    else
      srs match {
        case head :: tail =>
          val cc = tail.takeWhile(_.start <= head.finish).size
          countPairs(c + cc, tail)
        case Nil =>
          c
      }

  def solution(a: Array[Int]): Int = {
    val b = a.map(_.toLong)
    val rs = b.zipWithIndex.map { case (r, i) => Range(i - r, i + r) }
    val srs = rs.sortBy(_.start).toList
    countPairs(0, srs)
  }

  def main(args: Array[String]): Unit = {
    println(solution(Array(1, 5, 2, 1, 4, 0)))
  }

}