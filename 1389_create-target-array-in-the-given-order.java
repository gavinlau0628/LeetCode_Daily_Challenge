class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        // O(N^2) - NOT GOOD
        LinkedList<Integer> list = new LinkedList<>();  
        
        int value, indexInt = 0;
        
        for (int i=0; i<nums.length; i++)
        {
            value = nums[i];
            indexInt = index[i];
            
            list.add(indexInt, value);
        }
        
        int[] target = new int[list.size()];
        
        for (int j=0; j<list.size(); j++)
            target[j]=list.get(j);
        
        return target;
    }
}

/*
    Lesser space method

    When index[i] < i, it means nums[i]'s position in target array has been occupied. So starting from index[i] to i, we need to move target array rightward by one position.

    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            int idx = index[i];
            
            if(idx < i)
            {
                for(int j = i; j > idx; j--)
                    res[j] = res[j-1];
            } 
            
            res[idx] = nums[i];
        }
        
        return res;
    }

*/
