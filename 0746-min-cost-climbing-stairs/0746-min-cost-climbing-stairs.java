class Solution {
    int[] cases = new int[] {0, 1};

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) {
            return 0;
        } else if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        List<Integer> results = new ArrayList<>();
        int mid = cost.length/2;

        for (int i : cases) {
            int before = minCostClimbingStairs(Arrays.copyOfRange(cost, 0, mid + i - 1));
            int after = minCostClimbingStairs(Arrays.copyOfRange(cost, mid + i, cost.length));
            // int after = minCostClimbingStairsAfter(Arrays.copyOfRange(cost, mid + i, cost.length));
            int result = before + cost[mid + i - 1] + after;
            // int result = minCostClimbingStairs(Arrays.copyOfRange(cost, 0, mid + i)) + minCostClimbingStairs(Arrays.copyOfRange(cost, mid + i, cost.length));
            // System.out.println("min: " + (mid + i) + ", before: " + before + ", after: " + after + ", result: " + result + ",  " + Arrays.toString(cost));
            results.add(result);
        }

        return Collections.min(results);
    }

    public int minCostClimbingStairsAfter(int[] cost) {
        if (cost.length == 0) {
            return 0;
        } else if (cost.length == 1) {
            return cost[0];
        } else if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        List<Integer> results = new ArrayList<>();
        int mid = cost.length/2;

        for (int i : cases) {
            int before = minCostClimbingStairs(Arrays.copyOfRange(cost, 0, mid + i));
            int after = minCostClimbingStairsAfter(Arrays.copyOfRange(cost, mid + i, cost.length));
            int result = before + after;
            // int result = minCostClimbingStairs(Arrays.copyOfRange(cost, 0, mid + i)) + minCostClimbingStairs(Arrays.copyOfRange(cost, mid + i, cost.length));
            System.out.println("min: " + (mid + i) + ", before: " + before + ", after: " + after + ", result: " + result + ",  " + Arrays.toString(cost));
            results.add(result);
        }

        return Collections.min(results);
    }
}