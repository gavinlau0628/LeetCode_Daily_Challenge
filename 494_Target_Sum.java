public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        /* sum(P) - sum(N) = target
           2 * sum(P) = target + sum(ALL)
           sum(P) = (target + sum(ALL)) / 2
        */
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // Instead of finding all possible combination, we only need to find the sum of the positive combinations
        if (sum < S || (S + sum) % 2 != 0) {
            return 0;
        }
        return findWays(nums, (S + sum) / 2);
    }
    
    public int findWays(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        // Go through each num in nums[], and record the possible ways to reach 1 num by adding up
        /*
            For example, we will always have 1 for each num in nums in dp[] by default
            If we have 4 and 6, then we will have 1 at dp[10] by default because 4+6=10
            This way, the dp[] array will record how many ways to add up to dp[target]
        */
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }
}
