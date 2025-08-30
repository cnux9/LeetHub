class Solution {
    public int maxPower(String s) {
        char prev = '0';
        int count = 0;;
        int max = 0;
        for (char c : s.toCharArray()) {
            // System.out.println(prev + " " + c + " " + max);
            if (prev == c) {
                // System.out.println("    same! count: " + count);
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
            prev = c;
        }

        if (count > max) {
            max = count;
        }
        return max;
    }
}