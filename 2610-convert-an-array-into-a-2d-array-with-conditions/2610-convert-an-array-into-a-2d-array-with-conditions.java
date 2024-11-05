class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // count how many per nums
        HashMap<Integer,Integer> countByNum = new HashMap<>();
        for (int num:nums) {
            countByNum.putIfAbsent(num, 0);
            countByNum.put(num, countByNum.get(num)+1);
        }
        // stream builder of same count
        HashMap<Integer,IntStream.Builder> numByCountBuilder = new HashMap<>();
        for (int num:countByNum.keySet()) {
            int count = countByNum.get(num);
            numByCountBuilder.putIfAbsent(count, IntStream.builder());
            numByCountBuilder.get(count).add(num);
        }
        // stream builder into array
        int maxCount = numByCountBuilder.keySet().stream().mapToInt(Integer::intValue).max().getAsInt();
        int[][] numByCount = new int[maxCount][];
        for (int i=0;i<maxCount;i++) {
            if (numByCountBuilder.containsKey(i+1)) {
                numByCount[i] = numByCountBuilder.get(i+1).build().toArray();
            } else {
                numByCount[i] = new int[0];
            }
            
            System.out.println(i + " " + Arrays.toString(numByCount[i]));
        }
        System.out.println();
        // make answer 2d array
        List<Integer>[] answer = new ArrayList[maxCount];
        for (int i=0;i<maxCount;i++) {
            var target_i = answer[i];
            IntStream.Builder streamBuilder = IntStream.builder();
            for (int j=i;j<maxCount;j++) {
                var target_j = numByCount[j];
                for (int k=0;k<target_j.length;k++) {
                    streamBuilder.add(target_j[k]);
                }
            }
            answer[i] = streamBuilder.build().boxed().collect(Collectors.toList());
            System.out.println(answer[i].toString());
        }
        return Arrays.stream(answer).toList();
    }
}