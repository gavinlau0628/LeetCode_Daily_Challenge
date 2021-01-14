/*

Complexity Analysis

Time: O(n); we mark elements as visited and do not process them again.
Memory: O(n) for the recursion.

*/


class Solution {
    public boolean canReach(int[] arr, int st) {
    if (st >= 0 && st < arr.length && arr[st] < arr.length) {
        int jump = arr[st];
        arr[st] += arr.length;
        return jump == 0 || canReach(arr, st + jump) || canReach(arr, st - jump);
    }
    return false;
}
}


/*

Check 0 <= i < A.length
flip the checked number to negative A[i] = -A[i]
If A[i] == 0, get it and return true
Continue to check canReach(A, i + A[i]) and canReach(A, i - A[i])

Complexity
Time O(N), as each number will be flipper at most once.
Space O(N) for recursion.


Java:

    public boolean canReach(int[] A, int i) {
        return 0 <= i && i < A.length && A[i] >= 0 && ((A[i] = -A[i]) == 0 || canReach(A, i + A[i]) || canReach(A, i - A[i]));
    }


*/
