package academy.lesson15.abs_sum_of_two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {

  public int solution(int[] A) {
    // write your code in Java SE 8
    Integer[] a = IntStream.of(A).boxed().toArray(Integer[]::new);
    Arrays.sort(a, Comparator.comparingInt(Math::abs));
    int result = Math.abs(a[0] + a[0]);
    for (int i = 1; i < a.length; i++) {
      result = Math.min(result, Math.abs(a[i] + a[i - 1]));
    }
    return result;
  }
}