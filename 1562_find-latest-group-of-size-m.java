/*

Explanation
When we set bit a, where a = A[i],
we check the length of group on the left length[a - 1]
also the length of group on the right length[a + 1].
Then we update length[a - left], length[a + right] to left + right + 1.

Note that the length value is updated on the leftmost and the rightmost bit of the group.
The length value inside the group may be out dated.

As we do this, we also update the count of length.
If count[m] > 0, we update res to current step index i + 1.


Complexity
Time O(N)
Space O(N)

*/

class Solution {
        public int findLatestStep(int[] A, int m) {
        int res = -1, n = A.length;
        int[] length = new int[n + 2], count = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            int a = A[i], left = length[a - 1], right = length[a + 1];
            length[a] = length[a - left] = length[a + right] = left + right + 1;
            count[left]--;
            count[right]--;
            count[length[a]]++;
            if (count[m] > 0)
                res = i + 1;
        }
        return res;
    }
}
