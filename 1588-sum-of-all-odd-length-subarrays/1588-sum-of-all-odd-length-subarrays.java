class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int kind = (arr.length + 1) / 2 * 2 - 1;
        for (int i = 0; i < arr.length; i++) {
            int repeat = 0;
            for (int l = 1; l <= kind; l+=2) {
                int val1 = l - (arr.length - i);
                int val2 = (i < l -1 ? i :  l - 1) - (0 > val1 ? 0 : val1) + 1;
                repeat += val2 > 0 ? val2 : 0;
            }
            // System.out.println("i: " + i + ", arr[i]: " + arr[i] + ", repeat: " + repeat);
            sum += arr[i] * repeat;
        }
        return sum;
    }
}