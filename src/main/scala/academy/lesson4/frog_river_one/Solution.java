package academy.lesson4.frog_river_one;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

  public int solution(int X, int[] A) {
    // write your code in Java SE 8

    boolean[] leaves = new boolean[X];
    int c = 0;

    for (int i = 0; i < A.length; i++) {
      if (!leaves[A[i] - 1]) {
        c++;
        leaves[A[i] - 1] = true;
      }
      if (c == X) {
        return i;
      }
    }

    return -1;
  }
}