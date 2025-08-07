class Solution {
    int[] digits;
    public List<Integer> selfDividingNumbers(int left, int right) {
        int count = 0;
        int n = right + 1;
        while (n > 0) {
            n /= 10;
            count++;
        }
        digits = new int[count];

        n = left - 1;
        for (int i = 0; n > 0; i++) {
            // System.out.println(n + " ");
            digits[i] = n % 10;
            n /= 10;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            // System.out.print(Arrays.toString(digits) + " ");
            int j;
            for (j = 0; digits[j] == 9; j++) {

            }
            digits[j] += 1;
            for (j -= 1; j >= 0; j--) {
                digits[j] = 0;
            }


            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividingNumber(int n) {
        // System.out.print(Arrays.toString(digits) + " ");
        int i;
        for (i = digits.length - 1; digits[i] == 0; i--) {

        }
        // System.out.print(n + " ");
        for (int j = 0; j <= i; j++) {
            int digit = digits[j];
            if (digit == 0 || n % digit != 0) {
                // System.out.println(digit);
                return false;
            }
        }
        // System.out.println("true");
        return true;
    }
}