class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] lots = new int[100];

        for (List<Integer> range : nums) {
            for (int i = range.get(0); i <= range.get(1); i++) {
                lots[i - 1] = 1;
            }
        }
        int result = 0;
        for (int i = 0; i < lots.length; i++) {
            if (lots[i] == 1) {
                result += 1;
            }
        }
        return result;
    }
}