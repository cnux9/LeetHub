class Solution {
    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }

        int next = 0;
        String result = "";
        for (int i = 0; i < b.length(); i++) {
            // System.out.println(result + " : " + next + " : " + i);
            int cursor = Character.getNumericValue(b.charAt(b.length() - i - 1)) + next;
            next = 0;
            if (i <= a.length() - 1) {
                cursor += Character.getNumericValue(a.charAt(a.length() - i - 1));
            }
            if (cursor >= 2) {
                next = 1;
                cursor -= 2;
            }
            result = cursor + result;
        }
        if (next == 1) {
            result = next + result;
        }
        return result;
    }
}