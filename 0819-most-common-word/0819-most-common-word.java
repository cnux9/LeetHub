class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> dict = new HashMap<>();
        String[] words = paragraph.split("[!\\?,';\\.\\s]+");
        for (String word : words) {
            word = word.toLowerCase();
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }
        List bannedList = Arrays.asList(banned);
        String result = dict.keySet().stream().filter(k -> !bannedList.contains(k)).max(Comparator.comparingInt(k -> dict.get(k))).orElse("");
        return result;
    }
}