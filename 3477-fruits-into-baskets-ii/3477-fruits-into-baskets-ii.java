class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int left = fruits.length;

        for (int i = 0; i < fruits.length; i++) {
            int qty = fruits[i];
            for (int j = 0; j < fruits.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    baskets[j] = -1;
                    left--;
                    break;
                }
            }
        }

        return left;
    }
}