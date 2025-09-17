class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int repeat = ((i + 1) * (arr.length - i) + 1) / 2;
            // System.out.println("    " + (i + 1) * (arr.length - 1));
            // System.out.println("i: " + i + ", arr[i]: " + arr[i] + ", repeat: " + repeat);
            sum += arr[i] * repeat;
        }
        return sum;
    }
}