class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String c : commands) {
            if (c.equals("RIGHT")) {
                i++;
            } else if (c.equals("LEFT")) {
                i--;
            } else if (c.equals("UP")) {
                j--;
            } else if (c.equals("DOWN")) {
                j++;
            }
        }
        return j * n + i;
    }
}