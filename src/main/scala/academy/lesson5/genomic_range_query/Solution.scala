package academy.lesson5.genomic_range_query

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {
    // write your code in Scala 2.12
    def prefixSum(n: Char) = s.toCharArray.map(cc => if (cc == n) 1 else 0).scanLeft(0)((s, e) => s + e)

    val a = prefixSum('A')
    val c = prefixSum('C')
    val g = prefixSum('G')
    val t = prefixSum('T')
    //println(a.toList)
    //println(c.toList)
    //println(g.toList)
    //println(t.toList)

    p.zip(q).map { case (pp, qq) =>
      val na = a(qq + 1) - a(pp)
      val nc = c(qq + 1) - c(pp)
      val ng = g(qq + 1) - g(pp)
      val nt = t(qq + 1) - t(pp)

      if (na > 0) 1
      else if (nc > 0) 2
      else if (ng > 0) 3
      else if (nt > 0) 4
      else -1
    }
  }
}