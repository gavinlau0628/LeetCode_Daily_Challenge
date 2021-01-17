/*

Very Simple
10-99 ---- EVEN digit
1000-9999 --- EVEN digit

*/

class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;

        for(int i =0 ; i< nums.length; i++){

            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }

        return count;
    }
        
}
