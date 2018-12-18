package academy.lesson4.perm_check

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val n = a.length
    if (a.max > n)
      0
    else {
      val cs = new Array[Boolean](n)
      for (i <- 0 until n) {
        cs(a(i) - 1) = true
      }
      if (cs.forall(e => e)) 1 else 0
    }
  }
}