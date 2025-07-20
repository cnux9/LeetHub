class Solution {
    int[] nums;

    private class Node {
        Node left, right;
        int start, end;
        long product, gcd, lcm;

        Node(int start, int end) {
            this.start = start;
            this.end = end;
            if (end - start != 1) {
                // System.out.println("1");
                int mid = (start + end) / 2;
                this.left = new Node(start, mid);
                this.right = new Node(mid, end);
                
                this.product = this.left.product * this.right.product;
                this.gcd = getGcd(this.left.gcd, this.right.gcd);
                this.lcm = getLcm(this.left.lcm, this.right.lcm);
            } else {
                this.left = null;
                this.right = null;
                this.product = nums[start];
                this.gcd = nums[start];
                this.lcm = nums[start];
            }
        }

        public boolean isValid(int start, int end) {
            // System.out.println("called node is valid: " + this.start + ", " + this.end);
            if (this.start >= end || this.end <= start) {
                return false;
            }
            return true;
        }

        public long[] getValues(int start, int end) {
            // System.out.println("called node: " + this.start + ", " + this.end);
            if (this.left == null) {
                return new long[] {this.product, this. gcd, this.lcm};
            }
            // System.out.println("1");
            boolean isLeftValid = this.left.isValid(start, end);
            boolean isRightValid = this.right.isValid(start, end);
            if (isLeftValid && isRightValid) {
                return getValuesOtTwo(this.left.getValues(start, end), this.right.getValues(start, end));
            }
            if (isLeftValid) {
                return this.left.getValues(start, end);
            }
            return this.right.getValues(start, end);
        }
    }

    public int maxLength(int[] nums) {
        this.nums = nums;
        Node root = new Node(0, nums.length);
        for (int len = nums.length; len > 0; len--) {
            for (int i = 0; i + len - 1 < nums.length; i++) {
                    
                long[] arr = root.getValues(i, i + len);
                // System.out.println(Arrays.toString(arr));
                if (arr[0] == arr[1] * arr[2]) {
                    return len;
                }
            }
        }
        return -1;
    }

    private long getGcd(long a, long b) {
        return (b == 0)?  a : getGcd(b, a % b);
    }

    private long getLcm(long a, long b) {
        return (a * b) / getGcd(a, b);
    }

    private long[] getValuesOtTwo(long[] a, long[] b) {
        long[] arr = new long[] {
            a[0] * b[0],
            getGcd(a[1], b[1]),
            getLcm(a[2], b[2])
        };
        return arr;
    }
}