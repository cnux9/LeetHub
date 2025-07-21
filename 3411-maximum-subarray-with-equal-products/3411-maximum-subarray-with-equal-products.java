class Solution {
    private static final long GL = 11;
    private static final long LL = 2521;

    int[] nums;

    private class Node {
        Node left, right;
        int start, end;
        long val;

        Node(int start, int end) {
            this.start = start;
            this.end = end;
            if (end - start != 1) {
                // System.out.println("1");
                int mid = (start + end) / 2;
                this.left = new Node(start, mid);
                this.right = new Node(mid, end);
                
                long temp = this.left.val;
                long lp = temp / (GL * LL);
                temp %= (GL * LL);
                long lg = temp / LL;
                long ll = temp % LL;

                temp = this.right.val;
                long rp = temp / (GL * LL);
                temp %= (GL * LL);
                long rg = temp / LL;
                long rl = temp % LL;

                this.val = lp * rp;
                this.val = this.val * GL + getGcd(lg, rg);
                this.val = this.val * LL + getLcm(ll, rl);
            } else {
                this.left = null;
                this.right = null;
                this.val = nums[start];
                this.val = this.val * GL + nums[start];
                this.val = this.val * LL + nums[start];
            }
        }

        public boolean isValid(int start, int end) {
            // System.out.println("called node is valid: " + this.start + ", " + this.end);
            if (this.start >= end || this.end <= start) {
                return false;
            }
            return true;
        }

        public long getValues(int start, int end) {
            // System.out.println("called node: " + this.start + ", " + this.end);
            if (this.left == null) {
                return this.val;
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
                    
                long val = root.getValues(i, i + len);
                // System.out.println(Arrays.toString(arr));
                        
                long p = val / (GL * LL);
                val %= (GL * LL);
                long g = val / LL;
                long l = val % LL;

                if (p == g * l) {
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

    private long getValuesOtTwo(long a, long b) {
        long ap = a / (GL * LL);
        a %= (GL * LL);
        long ag = a / LL;
        long al = a % LL;

        long bp = b / (GL * LL);
        b %= (GL * LL);
        long bg = b / LL;
        long bl = b % LL;

        long val = ap * bp;
        val = val * GL + getGcd(ag, bg);
        val = val * LL + getLcm(al, bl);
        return val;
    }
}