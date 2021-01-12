/*

Complexity Analysis

Time Complexity: O(N)O(N), where NN is the length of A.

Space Complexity: O(N)O(N), the space used by the answer.



in-place swap 
    public int[] sortArrayByParity(int[] A) {
        for (int i = 0, j = 0; j < A.length; j++)
            if (A[j] % 2 == 0) {
                int tmp = A[i];
                A[i++] = A[j];
                A[j] = tmp;;
            }
        return A;
    }

*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] result = new int[A.length];
        
        int index = 0;
        
        for (int i : A)
        {
            if (i%2==0) 
            {
                result[index] = i;
                index++;
            }
        }
        
        for (int i : A)
        {
            if (i%2!=0) 
            {
                result[index] = i;
                index++;
            }
        }
        
        return result;
    }
}
