class Solution {
    public String getSmallestString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) % 2 != s.charAt(i + 1) % 2 || s.charAt(i) < s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 1)) {
                continue;
            }
            System.out.println("" + i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(s.charAt(j));
            }
            sb.append(s.charAt(i + 1));
            sb.append(s.charAt(i));
            for (int j = i + 2; j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
            String val = sb.toString();
            return val;
        }
        return s;
    }
}