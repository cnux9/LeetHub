class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        int[] digits = getDigits(right + 1);
        for (int i = right; i >= left; i--) {
            // System.out.print(Arrays.toString(digits) + " ");
            int j;
            for (j = 0; digits[j] == 0; j++) {

            }
            digits[j] -= 1;
            for (j -= 1; j >= 0; j--) {
                digits[j] = 9;
            }


            if (isSelfDividingNumber(digits, i)) {
                result.add(i);
            }
        }
        Collections.reverse(result);
        return result;
    }

    private int[] getDigits(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n% 10);
            n /= 10;
        }
        return digits.stream().mapToInt(i -> i).toArray();
    }

    private boolean isSelfDividingNumber(int[] digits, int n) {
        System.out.print(Arrays.toString(digits) + " ");
        int i;
        for (i = digits.length - 1; digits[i] == 0; i--) {

        }
        System.out.print(n + " ");
        for (int j = 0; j <= i; j++) {
            int digit = digits[j];
            if (digit == 0 || n % digit != 0) {
                System.out.println(digit);
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}