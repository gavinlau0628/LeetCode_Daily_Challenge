/*

Explanation
Calculate prefix sum B of list A.
B[j] - B[i] represents the sum of subarray A[i] ~ A[j-1]
Deque d will keep indexes of increasing B[i].
For every B[i], we will compare B[i] - B[d[0]] with K.


Complexity:
Every index will be pushed exactly once.
Every index will be popped at most once.

Time O(N)
Space O(N)

*/


class Solution {
        public int shortestSubarray(int[] A, int K) {
            int N = A.length, res = N + 1;
            int[] B = new int[N + 1];
            for (int i = 0; i < N; i++) B[i + 1] = B[i] + A[i];
            Deque<Integer> d = new ArrayDeque<>();
            for (int i = 0; i < N + 1; i++) {
                while (d.size() > 0 && B[i] - B[d.getFirst()] >=  K)
                    res = Math.min(res, i - d.pollFirst());
                while (d.size() > 0 && B[i] <= B[d.getLast()])
                    d.pollLast();
                d.addLast(i);
            }
            return res <= N ? res : -1;
    }
}
