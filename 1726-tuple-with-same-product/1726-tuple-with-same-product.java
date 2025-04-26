class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int val = nums[i] * nums[j];
                if (productCount.containsKey(val)) {
                    productCount.put(val, productCount.get(val) + 1);
                } else {
                    productCount.put(val, 1);
                }
            }
        }
        for (int n : productCount.values()) {
            count += n * (n-1) / 2;
        }
        return count * 8;
    }
}