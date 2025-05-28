class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long val = ((long) nums[i] - nums[j]) * nums[k];
                    if (max < val) {
                        System.out.println(i + " " + j + " " + k);
                        max = val;
                    }
                }
            }
        }
        return max;
    }
}