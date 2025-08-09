class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> history = new HashSet<>();
        int result = 0;
        for (int n : nums) {
            if (n <= 0) {
                continue;
            }
            if (!history.contains(n)) {
                history.add(n);
                result += n;
            }
        }
        return result;
    }
}