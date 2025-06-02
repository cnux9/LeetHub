class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> dict = new HashMap<>();
        String[] words = paragraph.split("[!\\?,';\\.\\s]+");
        for (String word : words) {
            word = word.toLowerCase();
            if (dict.containsKey(word)) {
                dict.put(word, dict.get(word) + 1);
            } else {
                dict.put(word, 1);
            }
        }
        List bannedList = Arrays.asList(banned);
        String result = dict.keySet().stream().filter(k -> !bannedList.contains(k)).max(Comparator.comparingInt(k -> dict.get(k))).orElse("");
        return result;
    }
}