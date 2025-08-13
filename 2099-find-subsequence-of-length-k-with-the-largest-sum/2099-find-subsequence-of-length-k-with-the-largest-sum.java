class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer> sub = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            sub.add(nums[i]);
        }
        boolean knowsMin = false;
        int minIndex = -1;
        int minValue = -1;
        for (int i = k; i < nums.length; i++) {
            if (!knowsMin) {
                minValue = sub.get(0);
                minIndex = 0;
                for (int j = 1; j < sub.size(); j++) {
                    if (minValue > sub.get(j)) {
                        minValue = sub.get(j);
                        minIndex = j;
                    }
                }
            }
            // System.out.println("" + minValue + " , " + minIndex);
            if (nums[i] > minValue) {
                // System.out.println("" + nums[i] + " > " + minValue);
                sub.remove(minIndex);
                sub.add(nums[i]);
                knowsMin = false;
            } else {
                knowsMin = true;
            }
        }
        return sub.stream().mapToInt(i -> i).toArray();
    }
}