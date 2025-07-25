class Solution {

    public String findValidPair(String s) {
        int[] count = new int[10];
        Arrays.fill(count, 0);
        int[] chars = s.chars().toArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] -= 48;
            count[chars[i]]++;
            // System.out.println(n - 48);
        }
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i+1] && chars[i] == count[chars[i]] && chars[i + 1] == count[chars[i + 1]]) {
                return "" + chars[i] + chars[i + 1];
            }
        }
        return "";
    }
}