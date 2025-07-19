class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        if (n == 1) {
            if (nums[0] == k)
                return 1;
            else
                return 0;
        }

        int[] ps = new int[n];
        int count = 0;

        ps[0] = nums[0];

        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }

        int L = 0;
        int R = 0;
        while (L < n) {
            if (L == 0) {
                if (ps[R] == k) {
                    count++;
                }
            } else {
                if (ps[R] - ps[L - 1] == k) {
                    count++;
                }
            }

            if (R == n - 1) {
                L++;
                R = L;
            } else {
                R++;
            }
        }

        return count;
    }
}