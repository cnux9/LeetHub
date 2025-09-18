class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenCur = 0;
        int oddCur = -1;
        while (oddCur < nums.length && evenCur < nums.length) {
            if (nums[evenCur] % 2 == 1) {
                if (oddCur <= evenCur) {
                    oddCur = evenCur + 1;
                    continue;
                }
                if (nums[oddCur] % 2 == 0) {
                    int temp = nums[evenCur];
                    nums[evenCur] = nums[oddCur];
                    nums[oddCur] = temp;

                    evenCur++;
                }
                oddCur++;
            } else {
                evenCur++;
            }
        }
        return nums;
    }
}