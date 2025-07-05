class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        char prev = '-';
        boolean wasCounted = false;
        for (char c : stones.toCharArray()) {
            if (c == prev && wasCounted) {
                count++;
                continue;
            }
            if (Arrays.binarySearch(chars, c) >= 0) {
                count++;
                wasCounted = true;
            } else {
                wasCounted = false;
            }
            prev = c;
        }
        return count;
    }
}