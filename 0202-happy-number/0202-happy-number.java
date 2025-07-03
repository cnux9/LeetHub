class Solution {
    public boolean isHappy(int n) {
        int result = n;

        int test_count = 0;
        while (result != 1) {
            int sum = 0;
            while (result > 0) {
                int digit = result % 10;
                sum += digit * digit;
                result /= 10;
            }
            result = sum;

            if (test_count == 7) {
                return false;
            }
            test_count++;
        }
        return true;
    }
}