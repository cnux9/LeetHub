class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('b', 0);
        dict.put('a', 0);
        dict.put('l', 0);
        dict.put('o', 0);
        dict.put('n', 0);
        for (char c : text.toCharArray()) {
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) + 1);
            }
        }
        dict.put('l', dict.get('l') / 2);
        dict.put('o', dict.get('o') / 2);
        return dict.values().stream().mapToInt(i -> i).min().orElse(0);
    }
}