class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                productCount.merge(nums[i] * nums[j], 1, Integer::sum);
            }
        }
        for (int n : productCount.values()) {
            count += n * (n-1) / 2;
        }
        return count * 8;
    }
}