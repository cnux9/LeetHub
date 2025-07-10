class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = -1;
        int secondMax = -1;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (max < n) {
                secondMax = max;
                max = n;
                maxIndex = i;
            } else if (secondMax < n) {
                secondMax = n;
            }
        }
        System.out.println(max + " " + secondMax);
        return secondMax * 2 <= max ? maxIndex : -1;
    }
}