class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (detail.charAt(11) > '6') {
                count++;
            } else if (detail.charAt(11) == '6' && detail.charAt(12) > '0') {
                count++;
            }
        }
        return count;
    }
}