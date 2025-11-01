class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n: nums) {
            if (freq.containsKey(n)) {
                return true;
            }
            freq.put(n, 1);
        }

        return false;
    }
}