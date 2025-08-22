class Solution {
    public String freqAlphabets(String s) {
        char[] charArray = s.toCharArray();
        char prev1 = charArray[1];
        char prev2 = charArray[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '#') {
                char val = (char)(((int)prev2 - 48) * 10 + (int)prev1 - 48 + 96);
                sb.append(val);
            } else if (prev1 != '#' && prev2 != '#') {
                char val = (char)((int)prev2 - 48 + 96);
                sb.append(val);
            } 
            prev2 = prev1;
            prev1 = c;
        }
        if (prev1 != '#') {
            if (prev2 != '#') {
                char val = (char)((int)prev2 - 48 + 96);
                sb.append(val);
            }
            char val = (char)((int)prev1 - 48 + 96);
            sb.append(val);
        } 
        return sb.toString();
    }
}