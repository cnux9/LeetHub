class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }
            if (isValid(nums.clone(), i, true)) {
                count++;
            }
            if (isValid(nums.clone(), i, false)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int[] nums, int curr, boolean isRight) {
        // System.out.println("");
        // System.out.println("new case");
        // System.out.println("");
        while (0 <= curr && curr < nums.length) {
            // System.out.println("curr: " + curr + ", nums[curr]: " + nums[curr] + "");
            // for (int i = 0; i < nums.length; i++) {
            //     int n = nums[i];
            //     if (i == curr) {
            //         System.out.print("[" + n + "], ");
            //     } else {
            //         System.out.print(n + ", ");
            //     }
            // }
            // System.out.println("");
            if (nums[curr] == 0) {
                // System.out.println("zero skipped!");
                curr += (isRight ? 1 : -1);
            } else {
                // System.out.println("decrement and reversed");
                nums[curr]--;
                isRight = !isRight;
                curr += (isRight ? 1 : -1);
            }
        }
        for (int n : nums) {
            if (n != 0) {
                // System.out.println("false");
                return false;
            }
        }
        // System.out.println("true");
        return true;
    }
}