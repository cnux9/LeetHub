class Solution {
    public int maximum69Number (int num) {
        int count = (int) Math.log10(num);
        for (int i = (int) Math.pow(10, count); i >= 1; i = i/10) {
            int digit = (num % (i * 10)) / i;
            if (digit == 6) {
                return num + (3 * i);
            }
        }
        return num;
    }
}