import java.util.stream.IntStream;
class Solution {
    public long maximumSum(List<Integer> nums) {
        long maxSum = 0;

        for (int i=1;i<=nums.size();i++) {
            
            int[] subset = getSubset(i,nums.size());
            long sum = IntStream.of(subset).mapToLong(j -> nums.get(j-1)).sum();
            System.out.println(sum + " " + maxSum);
            if (sum>maxSum) {
                System.out.println(Arrays.toString(subset));
            }
            maxSum = Math.max(maxSum, sum);
            // int a = subset[0];
            // int b = subset[2];
            // if (isPerfectSquare(a*b)) {
            //     int sum = IntStream.of(subset).map(i -> nums.get(i-1)).sum();
            //     maxSum = Math.max(maxSum, sum);
            // }
        }
        
        return maxSum;
    }

    private int[] getSubset(int init, int max) {
        IntStream.Builder builder = IntStream.builder();
        for (int i=1;init*i*i<=max;i++) {
            builder.add(init*i*i);
        }
        int[] subset = builder.build().toArray();
        System.out.println(Arrays.toString(subset));
        return subset;
    }

    private boolean isPerfectSquare(int num) {
        int i=1;
        while (i*i<=num) {
            if (i*i==num) {
                return true;
            }
            i++;
        }
        return false;
    }
}