class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        int i = 0;
        int j = 0;
        int prev = -1001;
        while (i < nums1.length || j < nums2.length) {
            int a = i < nums1.length ? nums1[i] : 1001;
            int b = j < nums2.length ? nums2[j] : 1001;
            if (a == prev) {
                i++;
            } else if (b == prev) {
                j++;
            } else if (a == b) {
                i++;
                j++;
                prev = a;
            } else if (a > b) {
                j++;
                prev = b;
                answer.get(1).add(b);
            } else {
                i++;
                prev = a;
                answer.get(0).add(a);
            }
        }
        return answer;
    }
}