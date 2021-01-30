/*

Check if A[i] == A[i - 1] or A[i] == A[i - 2]
If so, we return A[i]
If not, it must be [x, x, y, z] or [x, y, z, x].
We return A[0] for the cases that we miss.
O(N) time O(1) space

*/

class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 2; i < A.length; ++i)
            if (A[i] == A[i - 1] || A[i] == A[i - 2])
                return A[i];
        return A[0];
    }
}
