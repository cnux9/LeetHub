class Solution {
    public int differenceOfSum(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            int temp = num;
            int digitSum = 0;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
            
            diff += num - digitSum;
        }
        return diff;
    }
}