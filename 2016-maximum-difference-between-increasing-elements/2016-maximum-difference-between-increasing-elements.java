class Solution {
    public int maximumDifference(int[] nums) {
        List numList = new ArrayList();

        if (nums[0] > nums[1]) {

        }
        for (int i = 2; i < nums.length; i++) {

        }

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i-1] <= nums[i]) {
                continue;
            }
            for (int j = i+1; j < nums.length; j++) {
                int val = nums[j] - nums[i];
                if (max < val) {
                    // System.out.println(max + " " + val + " // " + i +  " : " + j);
                    max = val;
                }
            }
        }
        return max > 0 ? max : -1;
    }
}