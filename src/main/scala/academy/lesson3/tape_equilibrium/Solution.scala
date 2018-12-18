package academy.lesson3.tape_equilibrium

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    a.scanLeft(0)(_+_).zip( a.scanRight(0)(_+_)).drop(1).dropRight(1).map(p => Math.abs(p._1 - p._2)).min
  }
}