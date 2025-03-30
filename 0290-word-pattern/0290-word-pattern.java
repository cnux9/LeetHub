class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> charMap = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            Character c = pattern.charAt(i);
            if (charMap.containsKey(c)) {
                if (!charMap.get(c).equals(words[i])) {
                    return false;
                }
            } else {
                if (charMap.containsValue(words[i])) {
                    return false;
                }
                charMap.put(c, words[i]);
            }
        }
        return true;
    }
}