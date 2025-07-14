class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        System.out.println(s.length());
        int count = 0;
        int lineCount = 1;
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(i + " " + String.valueOf(s.charAt(i)) + " " + count + " " + lineCount);
            // System.out.println(i + " " + count + " " + lineCount);
            int ascii = (int)s.charAt(i) - 97;

            // System.out.println(ascii);
            count += widths[ascii];
            if (count > 100) {
                lineCount++;
                count = widths[ascii];
            }
        }
        return new int[] {lineCount, count};
    }
}