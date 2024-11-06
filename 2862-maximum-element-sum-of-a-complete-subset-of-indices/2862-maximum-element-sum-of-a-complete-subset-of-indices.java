import java.util.stream.IntStream;
class Solution {
    public long maximumSum(List<Integer> nums) {
        HashSet<Integer> history = new HashSet<>();
        long maxSum = 0;
        for (int i=1;i<=nums.size();i++) {
            if (!history.contains(i)) {
                int[] subset = getSubset(i,nums.size());
                long sum = IntStream.of(subset).mapToLong(j -> nums.get(j-1)).sum();
                history.addAll(IntStream.of(subset).boxed().toList());
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    private int[] getSubset(int init, int max) {
        IntStream.Builder builder = IntStream.builder();
        for (int i=1;init*i*i<=max;i++) {
            builder.add(init*i*i);
        }
        int[] subset = builder.build().toArray();
        // System.out.println(Arrays.toString(subset));
        return subset;
    }
}