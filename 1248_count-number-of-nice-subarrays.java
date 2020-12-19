/*
Solution II: One pass
Actually it's same as three pointers.
Though we use count to count the number of even numebers.
Insprired by @yannlecun.

Time O(N) for one pass
Space O(1)



*/


class Solution {
    public int numberOfSubarrays(int[] A, int k) {
        int res = 0, i = 0, count = 0, n = A.length;
        for (int j = 0; j < n; j++) {
            if (A[j] % 2 == 1) {
                --k;
                count = 0;
            }
            while (k == 0) {
                k += A[i++] & 1;
                ++count;
            }
            res += count;
        }
        return res;
    }
}
