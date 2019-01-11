package academy.lesson5.count_div

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Int, b: Int, k: Int): Int = {
    // write your code in Scala 2.12
    val c = if (a % k == 0) 1 else 0
    b / k - a / k + c
  }
}