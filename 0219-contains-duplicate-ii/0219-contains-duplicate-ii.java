class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (dict.containsKey(n) && i - dict.get(n) <= k) {
                return true;
            } else {
                dict.put(n, i);
            }
        }
        return false;
    }
}