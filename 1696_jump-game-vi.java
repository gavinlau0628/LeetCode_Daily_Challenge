class Solution {
    public int maxResult(int[] nums, int k) {
        if(nums.length == 1) return nums[0];
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{n - 1, nums[n - 1]});
        for (int i = n - 2; i >= 0; i--){
            while(!deque.isEmpty() && deque.peekFirst()[0] > i + k){
                deque.pollFirst();
            }
            
            ans = nums[i] + deque.peekFirst()[1];
            
            while(!deque.isEmpty() && deque.peekLast()[1] < ans){
                deque.pollLast();
            }
            
            deque.offer(new int[]{i, ans});
        }
        return ans;
    }
}
