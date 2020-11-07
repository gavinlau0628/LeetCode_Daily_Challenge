class Solution {
    public int lastStoneWeightII(int[] A) {
        // 由于限制条件：
        // 1 <= stones.length <= 30
        // 1 <= stones[i] <= 100
        // 所以石头重量总和最多为 30 * 100 = 3000 / 2 = 1500+1
        boolean[] dp = new boolean[1501];
        dp[0] = true;
        int sumA = 0;
        for (int a : A) {
            sumA += a;
            // 一定要用--，而不是++，不然同一块石头的重量会被视作可以反复利用
            for (int i = Math.min(1500, sumA); i >= a; --i)
                dp[i] = dp[i] || dp[i - a];
        }
        for (int i = sumA / 2; i >= 0; --i)
            if (dp[i]) return sumA - i - i;
        return 0;
    }
}
