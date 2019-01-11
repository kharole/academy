package academy.lesson4.max_counters;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution3 {

  public int[] solution(int N, int[] A) {
    // write your code in Java SE 8
    int currMax = 0;
    int nextMax = 0;
    int[] counters = new int[N];

    int M = A.length;
    for (int i = 0; i < M; i++) {
      int X = A[i] - 1;
      if (X < N) {
        if (counters[X] < currMax) {
          counters[X] = currMax;
        }
        int c = counters[X] + 1;
        counters[X] = c;
        nextMax = Math.max(nextMax, c);
      }
      if (X == N) {
        currMax = nextMax;
        //System.out.println(currMax);
      }
      //System.out.println(counters);
    }

    for (int j = 0; j < N; j++) {
      if (counters[j] < currMax) {
        counters[j] = currMax;
      }
    }

    return counters;
  }
}