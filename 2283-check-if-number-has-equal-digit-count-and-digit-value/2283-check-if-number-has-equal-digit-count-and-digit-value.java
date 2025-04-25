class Solution {
    public boolean digitCount(String num) {
        for (int i = 0; i < num.length(); i++) {
            // System.out.println("i: " + i);
            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                // System.out.println("    j: " + j);
                if (Character.forDigit(i, 10) == num.charAt(j)) {
                    // System.out.println("    add");
                    count++;
                }
            }
            // System.out.println("i: " + i + ", count: " + count);
            if (Character.forDigit(count, 10) != num.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}