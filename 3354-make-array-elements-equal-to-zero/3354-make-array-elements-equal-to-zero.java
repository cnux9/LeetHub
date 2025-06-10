class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }
            count += isValid(nums.clone(), i);
        }
        return count;
    }

    private int isValid(int[] nums, int curr) {
        int sum1 = 0;
        for (int i = 0; i < curr; i++) {
            sum1 += nums[i];
        }
        int sum2 = 0;
        for (int i = curr + 1; i < nums.length; i++) {
            sum2 += nums[i];
        }
        
        int count = 0;
        
        int diff = sum2 - sum1;
        if (0 <= diff && diff <= 1) {
            count++;
        };
        
        diff = sum1 - sum2;
        if (0 <= diff && diff <= 1) {
            count++;
        };

        return count;
    }
}