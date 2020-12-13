class Solution {
    public int[] runningSum(int[] nums) {
        
        int length = 1;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        
        int holder = sum[0];
        
        for (int i=1; i<nums.length; i++)
        {
            holder += nums[length];
            sum[i] = holder;
            length+=1;
        }
        
        return sum;
    }
    
    /*
        //modify the given array instead of creating a new one to save time & space
        
        public int[] runningSum(int[] A) {
            for (int i = 1; i < A.length; ++i)
                A[i] += A[i - 1];
            return A;
        }
    
    */
}
