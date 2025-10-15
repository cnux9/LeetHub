class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i : arr) {
            if (dict.containsKey(i)) {
                dict.put(i, dict.get(i) + 1);
            } else {
                dict.put(i, 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int o : dict.values()) {
            if (set.contains(o)) {
                return false;
            } else {
                set.add(o);
            }
        }
        return true;
    }
}