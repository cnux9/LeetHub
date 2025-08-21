class Solution {
    public int splitNum(int num) {
        int[] digits = new int[10];
        for (int i = 0; num > 0; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);

        int a = 0;
        int b = 0;
        boolean isA = true;
        for (int digit : digits) {
            if (isA) {
                a = a * 10 + digit;
            } else {
                b = b * 10 + digit;
            }
            isA = !isA;
        }
        return a + b + 1 - 1;
    }
}