class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1]; 

        List<Integer> result = new ArrayList<>();

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                result.add(i);
            }
        } else {
            for (int i = 1; i <= start; i++) {
                result.add(i);
            }
            for (int i = end; i <= n; i++) {
                result.add(i);
            }
        }
        return result;
    }
}