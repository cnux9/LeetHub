class Solution {
    public int numberOfMatches(int n) {
        if (n % 2 == 1) {
            if (n == 1) {
                return 0;
            }
            return numberOfMatches(n / 2 + 1) + n / 2;
        } else {
            return numberOfMatches(n / 2) +  n / 2;
        }
    }
}