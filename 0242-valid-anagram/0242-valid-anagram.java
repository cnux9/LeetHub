class Solution {
    public boolean isAnagram(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i : s.chars().toArray()) {
            sum1 += i;
            sum2 += i * i;
            sum3 += i * i * i;
        }
        for (int i : t.chars().toArray()) {
            sum1 -= i;
            sum2 -= i * i;
            sum3 -= i * i * i;
        }
        return sum1 == 0 && sum2 == 0 && sum3 == 0;
    }
}