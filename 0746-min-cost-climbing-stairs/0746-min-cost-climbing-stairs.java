class Solution {

    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> indexMinDict = new HashMap<>();
        int[] steps = new int[] {1, 2};

        List<int[]> queue = new ArrayList<>();
        // {present index, accumulated cost}
        queue.add(new int[] {-1, 0});
        int min = -1;
        while (!queue.isEmpty()) {
            int[] target = queue.remove(0);
            // System.out.println("(" + target[0] + ", " + target[1] + ")");
            
            for (int i : steps) {
                // System.out.println("start");
                if (cost.length <= target[0] + i) {
                    // System.out.println("continue: 1");
                    if (min == -1 || min > target[1]) {
                        min = target[1];
                    }
                    continue;
                }
                int[] step = new int[] {target[0] + i, target[1] + cost[target[0] + i]};
                // System.out.println("index: " + step[0] + ", cost: " + step[1] + "");

                if (indexMinDict.containsKey(step[0]) && indexMinDict.get(step[0]) <= step[1]) {
                    continue;
                }
                indexMinDict.put(step[0], step[1]);
                // System.out.println(step + " add");
                queue.add(step);
            }
        }
        return min;
    }
}