class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int[] f = new int[n];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            while (i > k && !queue.isEmpty() && queue.peekFirst() < i - k) {
                queue.pollFirst();
            }
            f[i] = Math.max(queue.isEmpty() ? 0 : f[queue.peekFirst()], 0) + nums[i];
            while (!queue.isEmpty() && f[i] >= f[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offer(i);
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
