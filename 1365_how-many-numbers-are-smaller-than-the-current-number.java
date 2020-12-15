class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] temp = new int[nums.length];
        temp = nums.clone();
        
        Arrays.sort(temp);
        
        for (int i=0; i<nums.length; i++)
        {
            nums[i] = findIndex(nums[i], temp);
        }
        return nums;
    }
    
    public int findIndex (int target, int[] temp)
    {
        int index = 0;
        
        for (int i=0; i<temp.length; i++)
        {
            if (temp[i] == target) 
                return index=i;
        }
        return 0;
    }
}
