class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int maxTime = 0;
        int maxTimeButton = 0;
        int prevTime = 0;
        for (int[] event : events) {
            int button = event[0];
            int time = event[1];

            int pushTime = time - prevTime;

            if (pushTime > maxTime) {
                maxTime = pushTime;
                maxTimeButton = button;
            } else if (pushTime == maxTime) {
                if (button < maxTimeButton) {
                    maxTimeButton = button;
                }
            }

            prevTime = time;
        }
        return maxTimeButton;
    }
}