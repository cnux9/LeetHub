class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = getScore(player1);
        int score2 = getScore(player2);
        if (score1 > score2) {
            return 1;
        } else if (score1 < score2) {
            return 2;
        }
        return 0;
    }

    private int getScore(int[] player) {
        int score = 0;
        for (int i = 0; i < player.length; i++) {
            if (i-2 >= 0 && player[i-2] == 10) {
                score += player[i] * 2;
            } else if (i-1 >= 0 && player[i-1] == 10) {
                score += player[i] * 2;
            } else {
                score += player[i];
            }
        }
        return score;
    }
}