class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count = new int[27];
        Arrays.fill(count, 0);
        word1.chars().forEach(i -> count[i-97]++);
        word2.chars().forEach(i -> count[i-97]--);
        for (int c : count) {
            if (c > 3 || c < -3) {
                return false;
            }
        }
        return true;
    }
}