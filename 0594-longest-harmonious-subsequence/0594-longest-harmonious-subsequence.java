class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
        int previousLength = 0;
        int maxLength = 0;
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            System.out.println(i + ": " + nums[i] + ", length = " + length + ", max: " + maxLength + ", previousLength: " + previousLength);
            int difference = nums[i] - nums[i-1];
            if (difference == 0) {
                length++;
            } else if (difference == 1) {
                if (previousLength != 0 && maxLength < length + previousLength) {
                    maxLength = length + previousLength;
                    System.out.println("     changeMax++ ");
                }
                previousLength = length;
                length = 1;
                System.out.println("     num changed by case 2");
            } else {
                if (previousLength != 0 && maxLength < length + previousLength) {
                    maxLength = length + previousLength;
                    // System.out.println("     changeMax++ ");
                }
                previousLength = 0;
                length = 1;
                // System.out.println("     num changed by case 3");
            }
        }
        if (previousLength != 0 && maxLength < length + previousLength) {
            System.out.println("     changeMax++ in the end");
            maxLength = length + previousLength;
        }
        return maxLength;
    }
}