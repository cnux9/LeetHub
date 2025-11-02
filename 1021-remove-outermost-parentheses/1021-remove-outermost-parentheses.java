class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (depth == 0) {
                depth++;
                continue;
            }
            if (depth == 1 && c == ')') {
                depth--;
                continue;
            }

            sb.append(c);
            
            if (c == '(') {
                depth++;
            } else {
                depth--;
            }
        }
        return sb.toString();
    }
}