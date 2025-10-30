class Solution {
    public boolean isSubstringPresent(String s) {
        char[] charArray = s.toCharArray();
        Set<String> substringSet = new HashSet<>();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i - 1] == charArray[i]) {
                return true;
            }
            String substring = "" + charArray[i - 1] + charArray[i];
            substringSet.add(substring);
        }
        for (int i = 1; i < charArray.length; i++) {
            String substring = "" + charArray[i] + charArray[i - 1];
            if (substringSet.contains(substring)) {
                return true;
            }
        }
        return false;
    }
}