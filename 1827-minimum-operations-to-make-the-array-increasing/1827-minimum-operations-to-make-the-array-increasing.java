class Solution {
    public int minOperations(int[] nums) {
        int prev = 0;
        int result = 0;
        for (int n : nums) {
            if (n <= prev) {
                result += (prev + 1) - n;
                prev += 1;
            } else {
                prev = n;
            }
        }
        return result;
    }
}