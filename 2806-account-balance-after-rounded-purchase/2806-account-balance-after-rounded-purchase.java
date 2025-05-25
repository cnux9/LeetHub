class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int val = 100 - purchaseAmount;
        return val - (val % 10);
    }
}