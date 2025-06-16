class Solution {
    public String getSmallestString(String s) {
        String min = s;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) % 2 != s.charAt(i + 1) % 2 || s.charAt(i) < s.charAt(i + 1)) {
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (j == i) {
                    sb.append(s.charAt(i + 1));
                } else if (j == i + 1) {
                    sb.append(s.charAt(i));
                } else {
                    sb.append(s.charAt(j));
                }
            }
            String val = sb.toString();
            if (val.compareTo(min) < 0) {
                return val;
            }
        }
        return min;
    }
}