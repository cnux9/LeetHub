class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k - numOnes <= 0) {
            return k;
        }
        k -= numOnes;
        if (k - numZeros <= 0) {
            return numOnes;
        }
        k -= numZeros;
        return numOnes - k;
    }
}