/*

Since every pair is taking the minimun
we can sort the array then take the element from every 2 index
add them up to get the sum

*/

class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for (int i=0; i<nums.length; i+=2)
        {
            sum+=nums[i];
        }
        
        return sum;
    }
}
