class Solution {
    public int findJudge(int n, int[][] trust) {
        for (int i = 1; i <= n; i++) {
            boolean isJudge = true;
            for (int[] rel : trust) {
                if (rel[0] == i) {
                    isJudge = false;
                    break;
                }
            }
            if (!isJudge) {
                continue;
            }

            for (int j = 1; j <= n; j++) {
                if (j != i) {
                    boolean isFound = false;
                    for (int[] rel : trust) {
                        if (rel[0] == j && rel[1] == i) {
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        isJudge = false;
                        break;
                    }
                }
            }
            if (!isJudge) {
                continue;
            }
            return i;
        }
        return -1;
    }
}