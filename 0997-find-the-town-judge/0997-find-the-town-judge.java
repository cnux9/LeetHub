class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] followers = new int[n];
        Arrays.fill(followers, 0);

        for (int[] rel : trust) {
            followers[rel[0]-1] = -1;
            followers[rel[1]-1]++;
        }

        for (int i = 0; i < n; i++) {
            if (followers[i] == n-1) {
                return i+1;
            }
        }
        return -1;
    }
}