class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> itemMap = new TreeMap<>();

        for (int[] item : items1) {
            itemMap.put(item[0], item[1]);
        }

        for (int[] item : items2) {
            itemMap.merge(item[0], item[1], Integer::sum);
        }

        List<List<Integer>> sortedList = itemMap.entrySet()
            .stream()
            .map(e -> List.of(e.getKey(), e.getValue()))
            .toList();

        return sortedList;
    }
}