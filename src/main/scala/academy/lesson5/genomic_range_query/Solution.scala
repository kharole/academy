package academy.lesson5.genomic_range_query

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {
    // write your code in Scala 2.12
    def prefixSum(n: Char) = s.map(c => if (c == n) 1 else 0).scanLeft(0)((s, e) => s + e)

    val pss = List('A', 'C', 'G', 'T').map(prefixSum)

    p.zip(q).map { case (rb, re) => pss.map(ps => ps(re + 1) - ps(rb)).indexWhere(_ > 0) + 1 }
  }
}