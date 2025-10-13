class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String w : words) {
            char position = w.charAt(w.length() - 1);
            result[position - 49] = w.substring(0, w.length() - 1);
        }

        return String.join(" ", result);
    }
}