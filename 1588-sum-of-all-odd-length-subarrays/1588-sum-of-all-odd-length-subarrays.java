class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int kind = (arr.length + 1) / 2 * 2 - 1;
        for (int i = 0; i < arr.length; i++) {
            int repeat = 0;
            for (int l = 1; l <= kind; l+=2) {
                for (int j = 0; j < l; j++) {
                    // System.out.println("        " + i + " " + l + " ?"); 
                    if (arr.length - i >= l - j && j <= i) {
                        // System.out.println("        " + i + " " + l + " " + j);
                        repeat++;
                    }
                }
            }
            // System.out.println("i: " + i + ", arr[i]: " + arr[i] + ", repeat: " + repeat);
            sum += arr[i] * repeat;
        }
        return sum;
    }
}