/*
Explanation
Loop once, we start from the initial value (start + 2 * 0 = start) and calculate XOR Operations step by step until we reach n-1.

Complexity

Time O(N)
Space O(1)

Java:
*/

class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        for (int i=1; i<n; i++){
            res = res ^ (start + 2 * i);
            }
        return res;
    }
}
