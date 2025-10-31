class Solution {
    public boolean isSubstringPresent(String s) {
        char[] charArray = s.toCharArray();
        Map<Character, Set<Character>> substringMap = new HashMap<>();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i - 1] == charArray[i]) {
                return true;
            }
            if (!substringMap.containsKey(charArray[i - 1])) {
                substringMap.put(charArray[i - 1], new HashSet<>());
            }
            substringMap.get(charArray[i - 1]).add(charArray[i]);
        }
        for (int i = 1; i < charArray.length; i++) {
            if (substringMap.containsKey(charArray[i]) && substringMap.get(charArray[i]).contains(charArray[i - 1])) {
                return true;
            }
        }
        return false;
    }
}