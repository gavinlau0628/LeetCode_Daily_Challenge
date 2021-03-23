class Solution {
    public int maximum69Number (int num) {
        int[] nums = new int[4];
        int div = 1000;
        int result = 0;
        int mul = 1000;
        
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = (num/div);
            num=num%div;
            div=div/10;
        }
        
        for (int j=0; j<nums.length; j++)
        {
            if (nums[j]==6) 
            {
                nums[j]=9;
                break;
            }
        }
        
        for (int k=0; k<nums.length; k++)
        {
            result = result+(nums[k]*mul);
            mul=mul/10;
        }
        
        return result;
    }
}
