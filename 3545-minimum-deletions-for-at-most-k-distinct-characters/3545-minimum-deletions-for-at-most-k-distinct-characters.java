import java.util.Collection;

class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        Collection<Integer> values = count.values();
        int removeNum = count.size() - k;
        if (removeNum <= 0) {
            return 0;
        }
        return values.stream().mapToInt(i -> i).sorted().limit(removeNum).sum();
    }
}