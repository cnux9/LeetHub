class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> dict = new HashMap<>();
        String[] words = paragraph.split("[!\\?,';\\.\\s]+");
        List bannedList = Arrays.asList(banned);
        for (String word : words) {
            word = word.toLowerCase();
            if (!bannedList.contains(word)) {
                dict.put(word, dict.getOrDefault(word, 0) + 1);
            }
        }
        String result = dict.keySet().stream().max(Comparator.comparingInt(k -> dict.get(k))).orElse("");
        return result;
    }
}