class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = -1, e = -1;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (found) {
                    e = i;
                } else {
                    s = i;
                    e = i;
                    found = true;
                }
            }
        }

        return new int[]{s,e};
    }
}