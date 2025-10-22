class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            if (n % 2 == 0) {
                count.put(n, count.getOrDefault(n, 1) + 1);
            }
        }

        int maxCount = 0;
        int maxValue = 0;
        for (int key : count.keySet()) {
            if (count.get(key) > maxCount) {
                maxCount = count.get(key);
                maxValue = key;
            } else if (count.get(key) == maxCount && maxValue > key) {
                maxValue = key;
            }
        }

        if (maxCount == 0) {
            return -1;
        }
        return maxValue;
    }
}