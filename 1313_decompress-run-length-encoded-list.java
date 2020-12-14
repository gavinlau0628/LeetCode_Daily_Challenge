/*
    [freq, val] = [nums[2*i], nums[2*i+1]]
*/


class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            
            //public static void fill(int[] a, int from_Index, int to_Index, int val)
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            
            startIdx += nums[i];
        }
        return result;
    }
}
