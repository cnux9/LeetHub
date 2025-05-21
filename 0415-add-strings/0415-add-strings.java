class Solution {
    public String addStrings(String num1, String num2) {
        int maxLength = num1.length() > num2.length() ? num1.length() : num2.length();
        String result = "";
        int carry = 0;
        for (int i = 0; i * 8 < maxLength; i++) {
            int val1 = findSubString(num1, i);
            int val2 = findSubString(num2, i);
            int sum = val1 + val2 + carry;
            System.out.println(i + " : " + val1 + ", " + val2 + " : " + sum + " : " + maxLength);
            if (sum >= 100000000) {
                System.out.println("carry");
                sum -= 100000000;
                carry = 1;
            } else {
                carry = 0;
            }
            if (sum == 0 && carry == 1) {
                result = "0".repeat(8) + result;
            } else {
                result = sum + "0".repeat(8 - ((result.length() + 7) % 8) - 1) + result;    
            }
            System.out.println(findSubString(result, 0) + " " + result.length());
        }
        if (carry == 1) {
            return 1 + result;
        } else {
            return result;
        }
    }

    private int findSubString(String s, int i) {
        if (i * 8 >= s.length()) {
            return 0;
        }
        if ((i + 1) * 8 > s.length()) {
            return Integer.valueOf(s.substring(0, s.length() - i * 8));
        }
        return Integer.valueOf(s.substring(s.length() - (i + 1) * 8, s.length() - i * 8));
    }
}