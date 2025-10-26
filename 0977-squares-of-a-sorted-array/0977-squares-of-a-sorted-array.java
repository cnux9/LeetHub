class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int cur = nums.length - 1;

        for (int i = 0; i< nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int right = nums.length - 1;
        int left = 0;
        boolean isRight = true;
        while (left <= right) {
            if (nums[left] < nums[right]) {
                result[cur] = nums[right];
                right--;
                isRight = true;
                cur--;
            } else {
                result[cur] = nums[left];
                left++;
                isRight = false;
                cur--;
            }
        }
        // if (isRight) {
        //     result[cur] = nums[left];
        // } else {
        //     result[cur] = nums[right];
        // }
        return result;
    }
}