package academy.lesson4.max_counters;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashMap;
import java.util.Map;

//100%
class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int currMax = 0;
        int nextMax = 0;
        Map<Integer, Integer> counters = new HashMap<>(N);
        
        int M = A.length;
        for(int i=0; i<M; i++) {
            int X = A[i]-1;
            if(X < N) {
              if (!counters.containsKey(X)) {
                counters.put(X, currMax);
              }
                int c = counters.get(X) + 1;
                counters.put(X, c);
                nextMax = Math.max(nextMax, c);
            }
            if(X == N) {
                counters = new HashMap<>(N);
                currMax = nextMax;
                //System.out.println(currMax);
            }
            //System.out.println(counters);
        }
        
        int[] result = new int[N];
        for(int j=0; j<N; j++) {
          if (counters.containsKey(j)) {
            result[j] = counters.get(j);
          } else {
            result[j] = currMax;
          }
        }
        
        return result;
    }
}