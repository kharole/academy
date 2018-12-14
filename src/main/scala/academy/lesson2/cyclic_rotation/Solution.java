package academy.lesson2.cyclic_rotation;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] result = new int[A.length];
        
        for(int i=0; i<A.length; i++) {
            result[(i+(K % A.length))% A.length] = A[i];
        }
        
        return result;
    }
}