package academy.lesson4.max_counters;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//88%
class Solution2 {
  public int[] solution(int N, int[] A) {
    // write your code in Java SE 8
    int currMax = 0;
    int nextMax = 0;
    Integer[] counters = new Integer[N];

    int M = A.length;
    for(int i=0; i<M; i++) {
      int X = A[i]-1;
      if(X < N) {
        if(counters[X] == null)
          counters[X] = currMax;
        int c = counters[X] + 1;
        counters[X] =  c;
        nextMax = Math.max(nextMax, c);
      }
      if(X == N) {
        counters = new Integer[N];
        currMax = nextMax;
        //System.out.println(currMax);
      }
      //System.out.println(counters);
    }

    int[] result = new int[N];
    for(int j=0; j<N; j++) {
      if(counters[j] != null)
        result[j] = counters[j];
      else
        result[j] = currMax;
    }

    return result;
  }
}