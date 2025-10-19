class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        int sum = 0;
        this.nums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            this.nums[i + 1] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        return nums[right + 1] - nums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */