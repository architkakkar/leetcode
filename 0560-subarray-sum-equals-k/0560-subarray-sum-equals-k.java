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

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    if (ps[j] == k)
                        count++;
                } else {
                    if (ps[j] - ps[i - 1] == k)
                        count++;
                }
            }
        }

        return count;
    }
}