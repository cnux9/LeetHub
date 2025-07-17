class Solution {
public:
    long long minCuttingCost(int n, int m, int k) {
        if (n > k) {
            return (long)k * (n - k);
        } else if (m > k) {
            return (long)k * (m - k);
        } else {
            return 0;
        }
    }
};