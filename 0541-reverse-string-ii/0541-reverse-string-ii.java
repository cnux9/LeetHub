class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // System.out.println(i + " " + s.charAt(i));
            int r = i % (2 * k);
            if (r < k) {
                if ((i - r) + k - r - 1 > s.length() - 1) {
                    r = i;
                    for (i = i; i < s.length(); i++) {
                        sb.append(s.charAt(s.length() + r - i - 1));
                    }
                    break;
                } else {
                    sb.append(s.charAt((i - r) + k - r - 1));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}