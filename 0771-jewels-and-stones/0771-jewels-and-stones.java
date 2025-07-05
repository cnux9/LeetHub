class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (Arrays.binarySearch(chars, c) >= 0) {
                count++;
            }
        }
        return count;
    }
}