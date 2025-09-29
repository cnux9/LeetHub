class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int result = 0;

        if (colors[colors.length - 2] == colors[0] && colors[colors.length - 1] != colors[0]) {
            result++;
        }

        if (colors[colors.length - 1] == colors[1] && colors[0] != colors[1]) {
            result++;
        }

        for (int i = 2; i < colors.length; i++) {
            if (colors[i - 2] == colors[i] && colors[i - 1] != colors[i]) {
                result++;
            }
        }

        return result;
    }
}