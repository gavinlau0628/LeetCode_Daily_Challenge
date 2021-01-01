class Solution {
    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> max = new ArrayDeque<>(); // monotonic decrease
        ArrayDeque<Integer> min = new ArrayDeque<>(); // monotonic increase
        int n = nums.length;
        max.offer(nums[0]);
        min.offer(nums[0]);
        int ans = 1;
        int i = 0;
        for (int j = 1; j < n; j++) {
            while (!max.isEmpty() && max.peekLast() < nums[j]) {
                max.pollLast();
            }
            max.offer(nums[j]);
            while (!min.isEmpty() && min.peekLast() > nums[j]) {
                min.pollLast();
            }
            min.offer(nums[j]);
            while (max.peekFirst() - min.peekFirst() > limit) {
                if (max.peekFirst() == nums[i]) {
                    max.pollFirst();
                }
                if (min.peekFirst() == nums[i]) {
                    min.pollFirst();
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
