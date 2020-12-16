class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int count = 0;
        
        for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                if (nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}

/*
Explanation
count the occurrence of the same elements.
For each new element a,
there will be more count[a] pairs,
with A[i] == A[j] and i < j


Complexity
Time O(N)
Space O(N)


    public int numIdenticalPairs(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }

*/
