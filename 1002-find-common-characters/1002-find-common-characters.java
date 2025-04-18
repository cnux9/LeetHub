class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            char target = words[0].charAt(i);
            if (result.containsKey(target)) {
                result.put(target, result.get(target)+1);
            } else {
                result.put(target, 1);
            }
        }

        for (int i = 1; i < words.length; i++) {
            for (char c : result.keySet()) {
                int count = countChar(words[i], c);
                if (count < result.get(c)) {
                    result.put(c, count);
                }
            }
        }

        List<String> resultList = new ArrayList<>();
        for (char c : result.keySet()) {
            for (int i = 0; i < result.get(c); i++) {
                resultList.add(String.valueOf(c));
            }
        }

        return resultList;
    }

    private int countChar(String word, char key) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == key) {
                count++;
            }
        }
        return count;
    } 
}