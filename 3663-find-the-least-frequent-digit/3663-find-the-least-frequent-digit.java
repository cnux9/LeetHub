class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr = new int[10];
        while (n > 0) {
            int r = n % 10;
            n /= 10;

            arr[r] += 1;
        }
        
        int min = 100;
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] && arr[i] != 0) {
                min = arr[i];
                num = i;
            }
        }
        return num;
    }
}