class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] exist = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0 && nums[i] < n) {
                int idx = nums[i];
                exist[idx] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!exist[i]) {
                return i;
            }
        }

        return n;
    }
}
