class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> dict = new HashSet<>();
        Set<String> multipleWords = new HashSet<>();

        for (String word : s1.split(" ")) {
            if (dict.contains(word)) {
                multipleWords.add(word);
            } else {
                dict.add(word);
            }
        }

        for (String word : s2.split(" ")) {
            if (dict.contains(word)) {
                multipleWords.add(word);
            } else {
                dict.add(word);
            }
        }
        
        dict.removeAll(multipleWords);
        return dict.stream().toArray(String[]::new);
    }
}