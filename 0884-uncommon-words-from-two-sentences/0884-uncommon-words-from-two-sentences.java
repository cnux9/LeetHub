class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();

        for (String w : s1.split(" "))
            count.merge(w, 1, Integer::sum);

        for (String w : s2.split(" "))
            count.merge(w, 1, Integer::sum);

        return count.entrySet().stream()
                    .filter(e -> e.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .toArray(String[]::new);
    }
}