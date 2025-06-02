class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> dict = new HashMap<>();
        String[] words = paragraph.split("[!\\?,';\\.\\s]+");
        Arrays.sort(banned);
        for (String word : words) {
            word = word.toLowerCase();
            // System.out.println(word + " " + Arrays.binarySearch(banned, word));
            if (Arrays.binarySearch(banned, word) < 0) {
                dict.put(word, dict.getOrDefault(word, 0) + 1);
            }
        }
        // for
        String result = dict.keySet().stream().max(Comparator.comparingInt(k -> dict.get(k))).orElse("");
        return result;
    }
}