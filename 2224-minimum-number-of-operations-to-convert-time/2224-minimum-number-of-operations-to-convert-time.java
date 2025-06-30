class Solution {
    public int convertTime(String current, String correct) {
        int diff = getMinute(current) - getMinute(correct);
        int count = 0;
        // int[] possibilities = new int[] {Math.abs(diff), diff + 1440, 1440 - diff};
        // Arrays.stream(possibilities).forEach(i -> System.out.println(i));
        // int r = Arrays.stream(possibilities).min().orElse(0);
        int r = Math.abs(diff);

        // System.out.println(r);

        int q;

        q = 60;
        count += r / q;
        r %= q;

        q = 15;
        count += r / q;
        r %= q;
        
        q = 5;
        count += r / q;
        r %= q;
        
        q = 1;
        count += r / q;
        r %= q;

        return count;
    }


    private int getMinute(String time) {
        int hour = twoLettersToInt(time, 0);
        int minute = twoLettersToInt(time, 3);
        // System.out.println("gm:");
        // System.out.println(hour);
        // System.out.println(minute);
        // System.out.println();
        return hour * 60 + minute;
    }

    private int twoLettersToInt(String s, int index) {
        return Integer.valueOf(s.substring(index, index + 2));
    }
}