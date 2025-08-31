class Solution {
    public double average(int[] salary) {
        // salary.length
        int sum = 0;
        int max = salary[0];
        int min = salary[0];
        for (int s : salary) {
            sum += s;
            if (max < s) {
                max = s;
            }
            if (min > s) {
                min = s;
            }
        }
        return (double)(sum - max - min) / (salary.length - 2);
    }
}