class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Boolean> wordCount = new HashMap<>();

        for (String word : s1.split(" ")) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, true);
            } else {
                wordCount.put(word, false);
            }
        }

        for (String word : s2.split(" ")) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, true);
            } else {
                wordCount.put(word, false);
            }
        }

        List<String> result = new ArrayList<>();

        for (String word : wordCount.keySet()) {
            if (!wordCount.get(word)) {
                result.add(word);
            }
        }

        return result.stream().toArray(String[]::new);
    }
}