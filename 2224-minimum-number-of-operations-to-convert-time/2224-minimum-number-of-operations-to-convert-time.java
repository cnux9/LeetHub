class Solution {
    public int convertTime(String current, String correct) {
        int diff = getMinute(current) - getMinute(correct);
        int count = 0;
        int r = Math.abs(diff);

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

        return count + r;
    }


    private int getMinute(String time) {
        int hour = Integer.valueOf(time.substring(0, 2));
        int minute = Integer.valueOf(time.substring(3, 5));
        return hour * 60 + minute;
    }
}