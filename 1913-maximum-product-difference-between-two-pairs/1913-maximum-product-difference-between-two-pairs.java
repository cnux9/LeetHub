class Solution {
    public int maxProductDifference(int[] nums) {
        int a = nums[0] > nums[1] ? 0 : 1;

        int firstMaxIndex = a;
        int secondMaxIndex = 1-a;
        int firstMinIndex = 1-a;
        int secondMinIndex = a;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[secondMaxIndex]) {
                if (nums[i] > nums[firstMaxIndex]) {
                    secondMaxIndex = firstMaxIndex;
                    firstMaxIndex = i;
                    continue;
                }
                secondMaxIndex = i;
            }
            if (nums[i] < nums[secondMinIndex]) {
                if (nums[i] < nums[firstMinIndex]) {
                    secondMinIndex = firstMinIndex;
                    firstMinIndex = i;
                } else {
                    secondMinIndex = i;
                }
            }
        }
        // System.out.println(firstMaxIndex + " " + secondMaxIndex+ " " + secondMinIndex + " " + firstMaxIndex);
        return nums[firstMaxIndex] * nums[secondMaxIndex] - nums[firstMinIndex] * nums[secondMinIndex];
    }
}