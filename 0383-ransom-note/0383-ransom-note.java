class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letters = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }
        for (char c : magazine.toCharArray()) {
            if (letters.containsKey(c)) {
                int count = letters.get(c);
                if (count == 1) {
                    letters.remove(c);
                } else {
                    letters.put(c, count - 1);
                }
            }
        }

        for (char c : letters.keySet()){
            System.out.println(String.valueOf(c));
            System.out.println(letters.get(c));
        }

        return letters.isEmpty();
    }
}