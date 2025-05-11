class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] followers = new int[n];
        boolean[] hasFollowing = new boolean[n];
        Arrays.fill(followers, 0);
        Arrays.fill(hasFollowing, false);

        for (int[] rel : trust) {
            hasFollowing[rel[0]-1] = true;
            followers[rel[1]-1]++;
        }


        for (int i = 0; i < n; i++) {
            if (!hasFollowing[i] && followers[i]==n-1) {
                return i+1;
            }
        }
        return -1;
    }
}