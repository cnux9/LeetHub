class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    private String process(String s) {
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(chars[i]);
            }
        }

        // System.out.println(sb.toString());
        return sb.toString();
    }
}