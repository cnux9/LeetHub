class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first)) {
                if (words[i + 1].equals(second)) {
                    result.add(words[i + 2]);
                }
            }
        }
        return result.toArray(String[]::new);
    }
}