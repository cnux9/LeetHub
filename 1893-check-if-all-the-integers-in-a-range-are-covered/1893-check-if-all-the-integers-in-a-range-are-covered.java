class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> integerSet = IntStream.rangeClosed(left, right).boxed().collect(Collectors.toSet());

        for (int[] range : ranges) {
            int rangeLeft = range[0];
            int rangeRight = range[1];
            Set<Integer> deleteSet = new HashSet<>();
            for (int num : integerSet) {
                if (rangeLeft <= num && num <= rangeRight) {
                    deleteSet.add(num);
                }
            }
            integerSet.removeAll(deleteSet);
        }
        return integerSet.isEmpty();
    }
}