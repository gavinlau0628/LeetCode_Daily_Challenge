class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[2*n];
        int even = 0;
        int odd = 1;
        
        for (int i=0; i<n; i++)
        {
            result[even] = nums[i];
            even+=2;
        }
        for (int j=n; j<nums.length; j++)
        {
            result[odd] = nums[j];
            odd+=2;
        }
        
        return result;
        Q
        
        /*
            // Can use a single loop, *2 for every i for even, *2+1 for odd
        
            int[] res = new int[2*n];
            for(int i = 0; i < n; i++){
               res[2 * i] = nums[i]; //even
               res[2 * i + 1] = nums[n+i]; //odd
            }
            return res;
        */
    }
}
