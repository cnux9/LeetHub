class Solution {
    public int[] findBall(int[][] grid) {
        int[] answers = new int[grid[0].length];

        for (int c = 0; c < answers.length; c++) {
            // System.out.println("\n" + c + "th column :");
            int answer = c;
            for (int r = 0; r < grid.length; r++) {
                // System.out.println("answer: " + answer + ", r: " + r);
                int target = grid[r][answer];
                if (target == 1) {
                    if (answer == answers.length - 1) {
                        answer = -1;
                        break;
                    } else {
                        if (grid[r][answer + 1] == 1) {
                            answer += 1;
                        } else {
                            answer = -1;
                            break;
                        }
                    }
                } else {
                    if (answer == 0) {
                        answer = -1;
                        break;
                    } else {
                        if (grid[r][answer - 1] == -1) {
                            answer -= 1;
                        } else {
                            answer = -1;
                            break;
                        }
                    }
                }
            }

            // System.out.println("answer: " + answer);
            answers[c] = answer;
        }
        return answers;
    }
}