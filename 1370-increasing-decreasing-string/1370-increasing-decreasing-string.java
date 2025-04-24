class Solution {
    private static char MIN_CHAR = '`';
    private static char MAX_CHAR = '{';

    public String sortString(String s) {
        // if (s.length() < 2) {
        //     return s;
        // }
        return upward(s, "");
    }

    private String upward(String s, String result, char last) {
        // System.out.println(s + " " + result);
        
        char min = MAX_CHAR;
        for (char c : s.toCharArray()) {
            if (c > last && (min == MAX_CHAR || c < min)) {
                min = c;
            }
        }
        if (min == MAX_CHAR) {
            return downward(s, result);
        }
        if (s.length() == 1) {
            return result + s;
        }
        return upward(s.replaceFirst(String.valueOf(min), ""), result + min, min);
    }

    private String upward(String s, String result) {
        return upward(s, result, MIN_CHAR);
    }

    private String downward(String s, String result, char last) {
        // System.out.println(s + " " + result);
        
        char min = MIN_CHAR;
        for (char c : s.toCharArray()) {
            if (c < last && (min == MIN_CHAR || c > min)) {
                min = c;
            }
        }
        if (min == MIN_CHAR) {
            return upward(s, result);
        }
        if (s.length() == 1) {
            return result + s;
        }
        return downward(s.replaceFirst(String.valueOf(min), ""), result + min, min);
    }

    private String downward(String s, String result) {
        return downward(s, result, MAX_CHAR);
    }
}