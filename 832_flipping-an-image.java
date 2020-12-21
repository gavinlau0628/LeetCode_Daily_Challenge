/*

Explanation:
reverse every row.
toggle every value.

In Java, I did both steps together:
Compare the i th and n - i - 1 th in a row.
The "trick" is that if the values are not the same,
but you swap and flip, nothing will change.
So if they are same, we toggle both, otherwise we do nothing.


Complexity:
Time O(N^2)
Space O(N^2) for output


Java:

*/

class Solution {


    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int[] row : A)
            for (int i = 0; i * 2 < n; i++)
                if (row[i] == row[n - i - 1])
                    row[i] = row[n - i - 1] ^= 1;
        return A;
    }
}
