class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[100];
        Arrays.fill(counts, 0);

        for (int n : nums) {
            counts[n]++;
        }

        int result = 0;
        for (int c : counts) {
            result += c * (c-1) / 2;
        }
        return result;
    }
}