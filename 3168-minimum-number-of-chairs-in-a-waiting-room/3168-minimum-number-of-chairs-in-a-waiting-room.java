class Solution {
    public int minimumChairs(String s) {
        int chair = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                chair++;
                if (chair > max) {
                    max = chair;
                }
            } else {
                if (chair > 0) {
                    chair--;
                }
            }
        }
        return max;
    }
}