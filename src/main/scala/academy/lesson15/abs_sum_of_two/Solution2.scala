package academy.lesson15.abs_sum_of_two

import java.lang.Math.{abs, min}

object Solution2 {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val b = a.sortBy(abs(_))
    var result = 2 * abs(b(0))
    for (i <- 1 until b.length) {
      result = min(result, abs(b(i) + b(i - 1)))
    }
    result
  }
}
