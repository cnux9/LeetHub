class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candySet = new HashSet<>();
        for (int t : candyType) {
            candySet.add(t);
            if (candySet.size() >= candyType.length / 2) {
                return candyType.length / 2;
            }
        }
        return Math.min(candySet.size(), candyType.length / 2);
    }
}