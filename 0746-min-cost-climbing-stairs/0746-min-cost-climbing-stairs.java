class Solution {
    int[] cost;
    int[] cases = new int[] {0, 1};

    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        return minCostClimbingStairsInternal(0, cost.length);
    }

    public int minCostClimbingStairsInternal(int start, int end) {
        if (end - start <= 1) {
            return 0;
        } else if (end - start  == 2) {
            return Math.min(cost[start], cost[start + 1]);
        }

        List<Integer> results = new ArrayList<>();
        int mid = (end - start)/2;

        for (int i : cases) {
            int before = minCostClimbingStairsInternal(start, start + mid + i - 1);
            int after = minCostClimbingStairsInternal(start + mid + i, end);
            // int after = minCostClimbingStairsAfter(Arrays.copyOfRange(cost, mid + i, cost.length));
            int result = before + cost[start + mid + i - 1] + after;
            // int result = minCostClimbingStairs(Arrays.copyOfRange(cost, 0, mid + i)) + minCostClimbingStairs(Arrays.copyOfRange(cost, mid + i, cost.length));
            // System.out.println("min: " + (mid + i) + ", before: " + before + ", after: " + after + ", result: " + result + ",  " + Arrays.toString(cost));
            results.add(result);
        }

        return Collections.min(results);
    }
}