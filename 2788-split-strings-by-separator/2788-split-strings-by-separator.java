import java.util.regex.Pattern;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            // System.out.println(word);
            String[] wordsArray = word.split(Pattern.quote(Character.toString(separator)));
            for (String w : wordsArray) {
                // System.out.println("    " + w);
                if (w.length() != 0 ){
                    result.add(w);
                }
            }
        }
        return new ArrayList<>();
    }
}