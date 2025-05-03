class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min = nums1[0];
        boolean isThereSameElement = false;
        for (int n : nums1) {
            for (int m : nums2) {
                if (n == m) {
                    isThereSameElement = true;
                    if (min > n) {
                        min = n;
                    }
                }
            }
        }
        if (isThereSameElement) {
            return min;
        }

        int num1 = IntStream.of(nums1).min().orElse(0);
        int num2 = IntStream.of(nums2).min().orElse(0);
        if (num1 > num2) {
            return num2 * 10 + num1;
        }
        return num1 * 10 + num2;
    }
}