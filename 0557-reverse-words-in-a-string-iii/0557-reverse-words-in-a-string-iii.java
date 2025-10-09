class Solution {
    public String reverseWords(String s) {
        String[] ws = s.split(" ");
        for (int i = 0; i < ws.length; i++) {
            StringBuilder sb = new StringBuilder();
            char[] cs = ws[i].toCharArray();
            for (int j = cs.length - 1; j >= 0; j--) {
                sb.append(cs[j]);
            }
            ws[i] = sb.toString();
        }
        return String.join(" ", ws);
    }
}