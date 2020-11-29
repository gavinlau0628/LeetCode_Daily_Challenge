class Solution {
        public int[] mostCompetitive(int[] A, int k) {
        int stack[] = new int[k], n = A.length, j = 0;
        for (int i = 0; i < n; ++i) {
            while (j > 0 && stack[j - 1] > A[i] && j - 1 + n - i >= k)
                j--;
            if (j < k)
                stack[j++] = A[i];
        }
        return stack;
    }
}
