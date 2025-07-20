class Solution {
    public int maxLength(int[] nums) {
        for (int len = nums.length; len > 0; len--) {
            
            // System.out.println("" + len);
            for (int i = 0; i + len - 1 < nums.length; i++) {
                long product = (long)nums[i];
                int gcdNum = nums[i];
                int lcmNum = nums[i];
                for (int j = 1; j < len; j++) {
                    // System.out.println("    " + i + " " + j);
                    product *= nums[i + j];
                    gcdNum = gcd(gcdNum, nums[i + j]);
                    lcmNum = lcm(lcmNum, nums[i + j]);
                }
                
                // System.out.println(product + " " + gcdNum + " " + lcmNum + "\n");
                if (product == (long) gcdNum * lcmNum) {
                    return len;
                }

            }
        }
        return -1;
    }

    private int gcd(int a, int b) {
        return (b == 0)?  a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}