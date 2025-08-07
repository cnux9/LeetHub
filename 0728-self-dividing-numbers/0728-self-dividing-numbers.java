class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividingNumber(int n) {
        List<Integer> digits = new ArrayList<>();
        int left = n;
        while (left > 0) {
            int digit = left % 10;
            if (digit == 0) {
                return false;
            }
            digits.add(digit);
            left /= 10;
        }
        for (int digit : digits) {
            if (n % digit != 0) {
                return false;
            }
        }
        return true;
    }
}