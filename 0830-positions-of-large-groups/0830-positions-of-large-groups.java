class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        char prev = '0';
        int count = 0;
        int start = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (prev == c) {
                count++;
            } else {
                if (count >= 3) {
                    List<Integer> index = new ArrayList<>();
                    index.add(start);
                    index.add(i - 1);
                    result.add(index);
                }
                prev = c;
                count = 1;
                start = i;
            }
        }
        if (count >= 3) {
            List<Integer> index = new ArrayList<>();
            index.add(start);
            index.add(s.length() - 1);
            result.add(index);
        }
        return result;
    }
}