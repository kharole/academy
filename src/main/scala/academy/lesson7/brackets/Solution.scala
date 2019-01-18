package academy.lesson7.brackets

import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(s: String): Int = {
    // write your code in Scala 2.12
    def op(c: Char) = c match {
      case '}' => '{'
      case ']' => '['
      case ')' => '('
    }

    val z: Option[List[Char]] = Some(List[Char]())
    s.foldLeft(z) {
      case (Some(st), c@('{' | '(' | '[')) => Some(c :: st)
      case (Some(hd :: tl), c@('}' | ')' | ']')) if hd == op(c) => Some(tl)
      case _ => None
    }.map(s => if (s.size == 0) 1 else 0).getOrElse(0)
  }
}