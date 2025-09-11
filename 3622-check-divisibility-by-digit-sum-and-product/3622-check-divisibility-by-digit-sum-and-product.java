class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        
        int r = n;
        while (r > 0) {
            int digit = r % 10;
            r /= 10;

            sum += digit;
            product *= digit;
        }

        return n % (sum + product) == 0;
    }
}