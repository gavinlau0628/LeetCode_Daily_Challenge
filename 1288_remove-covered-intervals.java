/*

    Solution 1, sort
Sort the array, and note the previous left and right bound.
For evert interval v,
if v[0] > left && v[1] > right,
It's a new uncovered interval,
so we increment ++res.

Complexity: time O(NlogN), space O(1)


Java:

*/

class Solution {
    public int removeCoveredIntervals(int[][] A) {
        int res = 0, left = -1, right = -1;
        Arrays.sort(A, (a, b) -> a[0] - b[0]);
        for (int[] v : A) {
            if (v[0] > left && v[1] > right) {
                left = v[0];
                ++res;
            }
            right = Math.max(right, v[1]);
        }
        return res;
    }
}
