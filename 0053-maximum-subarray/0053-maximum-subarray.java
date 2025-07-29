class Solution {
    /**
    * Uses Kadane's Algorithm to find the max subarray sum.
    * TC: O(n), SC: O(1)
    */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}